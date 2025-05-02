package gamemode.models;

import java.util.Scanner;

public class Game {
    private Hero hero;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Karakter:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            hero = new Archer("Pemanah", 100, 15);
        } else if (pilihan == 2) {
            hero = new Wizard("Penyihir", 80, 20);
        } else if (pilihan == 3) {
            hero = new Fighter("Petarung", 120, 10);
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        int aksi = 0;
        while (aksi != 2) {
            System.out.println("\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih aksi: ");
            aksi = scanner.nextInt();

            if (aksi == 1) {
                hero.attack();
            } else if (aksi == 2) {
                System.out.println("Game selesai!");
            } else {
                System.out.println("Aksi tidak valid!");
            }
        }
    }
}
