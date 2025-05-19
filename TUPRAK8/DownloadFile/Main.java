package DownloadFile;

import java.util.*;
import java.util.concurrent.*;

public class Main {

    static int successfulDownloads = 0;
    static int completedDownloads = 0;
    static int totalFiles;
    static volatile boolean allDone = false;
    static ArrayList<Result> results = new ArrayList<>();

    // (1) Mencatat hasil download secara thread-safe
    public static synchronized void recordResult(int fileId, int duration, String threadName) {
        completedDownloads++;
        String status = duration <= 2 ? "Success" : "Timeout";
        if (status.equals("Success")) {
            successfulDownloads++;
        }
        results.add(new Result(fileId, threadName, duration, status));
    }

    public static void main(String[] args) {

        // (2) Input jumlah file
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah file yang akan di-download: ");
        totalFiles = scanner.nextInt();

        // (3) Executor untuk download dan UI
        ExecutorService downloadExecutor = Executors.newFixedThreadPool(3);
        ExecutorService uiExecutor = Executors.newSingleThreadExecutor();

        // Mencatat waktu mulai
        long startTime = System.currentTimeMillis();

        // (4) Tampilkan progress setiap detik
        uiExecutor.submit(() -> {
            int time = 0;
            while (!allDone) {
                try {
                    System.out.printf("Downloading files... (%ds)%n", time);
                    Thread.sleep(1000);
                    time++;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        // (5) Submit task download ke thread pool
        for (int i = 1; i <= totalFiles; i++) {
            final int fileId = i;
            downloadExecutor.submit(() -> {
                try {
                    int duration = new Random().nextInt(3) + 1; // 1-3 detik
                    Thread.sleep(duration * 1000L);
                    recordResult(fileId, duration, Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // (6) Shutdown executor download
        downloadExecutor.shutdown();

        // (7) Tunggu semua download selesai
        try {
            downloadExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // (8) Sinyal ke UI bahwa semua selesai, lalu shutdown UI executor
        allDone = true;
        uiExecutor.shutdown();
        try {
            uiExecutor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Mencatat total waktu proses secara keseluruhan
        long endTime = System.currentTimeMillis();
        int totalTime = (int) ((endTime - startTime) / 1000);

        // Header tabel
        System.out.println("--------------------------------------------------");
        System.out.println("                  Detailed Report                 ");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-8s | %-18s | %-8s | %-8s%n",
                "File ID", "Thread", "Duration", "Status");
        System.out.println("--------------------------------------------------");

        // Urutkan hasil berdasarkan fileId
        results.sort(Comparator.comparingInt(r -> r.fileId));

        // Tampilan hasil setiap proses download dalam bentuk table
        for (Result r : results) {
            System.out.printf("%-8d | %-18s | %-8s | %-8s%n",
                    r.fileId, r.threadName, r.duration + "s", r.status);
        }

        // Ringkasan Proses
        System.out.println("--------------------------------------------------");
        System.out.println("                     Summary                      ");
        System.out.println("--------------------------------------------------");
        System.out.println("Successful downloads : " + successfulDownloads);
        System.out.println("Failed downloads     : " + (totalFiles - successfulDownloads));
        System.out.printf("Total time           : %ds%n", totalTime);
    }
}
