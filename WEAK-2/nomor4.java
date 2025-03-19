import java.util.Scanner;

class Alamat {
    String jalan;
    String kota;

    String getAlamat() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.getAlamat();
    }
}

public class nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Alamat alamat = new Alamat();
        System.out.print("Masukkan jalan: ");
        alamat.jalan = scanner.nextLine();
        System.out.print("Masukkan kota: ");
        alamat.kota = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        System.out.print("Masukkan nama: ");
        mahasiswa.nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        mahasiswa.nim = scanner.nextLine();

        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        
        scanner.close();
    }
}