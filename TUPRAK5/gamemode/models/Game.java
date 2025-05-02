package gamemode.models;

import java.util.Scanner;

public class Game {
    private Hero character;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        pilihKarakter();
        menuInteraksi();
    }

    private void pilihKarakter() {
        System.out.println("Pilih karakter:");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("Masukkan pilihan (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // konsumsi newline

        switch (choice) {
            case 1:
                System.out.print("Masukkan nama Archer: ");
                String archerName = scanner.nextLine();
                character = new Archer(archerName);
                break;
            case 2:
                System.out.print("Masukkan nama Wizard: ");
                String wizardName = scanner.nextLine();
                character = new Wizard(wizardName);
                break;
            case 3:
                System.out.print("Masukkan nama Fighter: ");
                String fighterName = scanner.nextLine();
                character = new Fighter(fighterName);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                System.exit(0);
        }
    }

    private void menuInteraksi() {
        while (true) {
            System.out.println("\\nMenu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan (1-2): ");
            int action = scanner.nextInt();

            if (action == 1) {
                character.attack();
            } else if (action == 2) {
                System.out.println("Keluar dari permainan.");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
