class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getAlamatLengkap();
    }
}

public class nomor4{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nurul";
        mahasiswa.nim = "H071241015";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("NIM: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}