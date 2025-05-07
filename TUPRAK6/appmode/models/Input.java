package appmode;

import appmode.models.*;
import appmode.service.IBergerak;
import java.util.Scanner;

public class Input {
    public static void handleInput() {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Mobil
        Mobil mobil = new Mobil();
        System.out.println("Masukkan ID Mobil: ");
        mobil.setId(scanner.nextLine());
        System.out.println("Masukkan Merek Mobil: ");
        mobil.setMerek(scanner.nextLine());
        System.out.println("Masukkan Model Mobil: ");
        mobil.setModel(scanner.nextLine());
        System.out.println("Masukkan Tahun Produksi Mobil: ");
        mobil.setTahunProduksi(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer
        System.out.println("Masukkan Warna Mobil: ");
        mobil.setWarna(scanner.nextLine());
        System.out.println("Masukkan Jumlah Pintu Mobil: ");
        mobil.setJumlahPintu(scanner.nextInt());
        System.out.println("Masukkan Kapasitas Mesin Mobil (L): ");
        mobil.setKapasitasMesin(scanner.nextDouble());
        System.out.println("Masukkan Jumlah Kursi Mobil: ");
        mobil.setJumlahKursi(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer
        System.out.println("Masukkan Bahan Bakar Mobil: ");
        mobil.setBahanBakar(scanner.nextLine());
        mobil.tampilkanSpesifikasi();
        System.out.println(mobil.getDetail());

        // Input untuk Motor
        Motor motor = new Motor();
        System.out.println("Masukkan ID Motor: ");
        motor.setId(scanner.nextLine());
        System.out.println("Masukkan Merek Motor: ");
        motor.setMerek(scanner.nextLine());
        System.out.println("Masukkan Model Motor: ");
        motor.setModel(scanner.nextLine());
        System.out.println("Masukkan Tahun Produksi Motor: ");
        motor.setTahunProduksi(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer
        System.out.println("Masukkan Warna Motor: ");
        motor.setWarna(scanner.nextLine());
        System.out.println("Masukkan Jenis Motor: ");
        motor.setJenisMotor(scanner.nextLine());
        System.out.println("Masukkan Kapasitas Tangki Motor (L): ");
        motor.setKapasitasTangki(scanner.nextDouble());
        scanner.nextLine(); // Membersihkan buffer
        System.out.println("Masukkan Tipe Suspensi Motor: ");
        motor.setTipeSuspensi(scanner.nextLine());
        motor.tampilkanSpesifikasi();
        System.out.println(motor.getDetail());

        // Input untuk Sepeda
        Sepeda sepeda = new Sepeda();
        System.out.println("Masukkan Jenis Sepeda: ");
        sepeda.setJenisSepeda(scanner.nextLine());
        System.out.println("Masukkan Jumlah Gear Sepeda: ");
        sepeda.setJumlahGear(scanner.nextInt());
        System.out.println("Masukkan Ukuran Roda Sepeda (inci): ");
        sepeda.setUkuranRoda(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer
        sepeda.tampilkanSpesifikasi();

        // Input untuk MobilSport
        MobilSport sport = new MobilSport();
        System.out.println("Masukkan ID Mobil Sport: ");
        sport.setId(scanner.nextLine());
        System.out.println("Masukkan Merek Mobil Sport: ");
        sport.setMerek(scanner.nextLine());
        System.out.println("Masukkan Model Mobil Sport: ");
        sport.setModel(scanner.nextLine());
        System.out.println("Masukkan Tahun Produksi Mobil Sport: ");
        sport.setTahunProduksi(scanner.nextInt());
        scanner.nextLine(); // Membersihkan buffer
        System.out.println("Masukkan Warna Mobil Sport: ");
        sport.setWarna(scanner.nextLine());
        System.out.println("Masukkan Kecepatan Maksimal Mobil Sport (km/h): ");
        sport.setKecepatanMaks(scanner.nextDouble());
        scanner.nextLine(); // Membersihkan buffer
        sport.bergerak();
        System.out.println(sport.getDetail());

        scanner.close();
    }
}