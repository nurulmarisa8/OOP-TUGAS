import java.util.Random;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        int[][] angka = new int[3][3]; 
        Random random = new Random(); 
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < angka.length; x++) {
            for (int y = 0; y < angka[x].length; y++) {
                angka[x][y] = random.nextInt(9) + 1;
            }
        }

        System.out.println("Array yang diisi dengan angka acak:");
        for (int x = 0; x < angka.length; x++) {
            for (int y = 0; y < angka[x].length; y++) {
                System.out.print(angka[x][y] + " ");
            }
            System.out.println();
        }

        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int cari = scanner.nextInt();
            boolean ditemukan = false;

            for (int x = 0; x < angka.length; x++) {
                for (int y = 0; y < angka[x].length; y++) {
                    if (angka[x][y] == cari) {
                        System.out.println("Found " + cari + " at [" + x + "][" + y + "]");
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) break;

            }

            if (!ditemukan) System.out.println("Angka tidak ditemukan.");
        } catch (Exception e) {
            System.out.println("Input tidak valid! Masukkan bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}