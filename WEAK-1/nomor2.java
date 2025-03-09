import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka yang ingin dicari: ");
            int cari = scanner.nextInt();
            boolean ditemukan = false;

            for (int x = 0; x < nums.length; x++) {
                for (int y = 0; y < nums[x].length; y++) {
                    if (nums[x][y] == cari) {
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
