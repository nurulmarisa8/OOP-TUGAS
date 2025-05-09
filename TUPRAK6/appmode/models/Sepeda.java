package appmode.models;

public class Sepeda {
    protected String jenisSepeda;
    protected int jumlahGear;
    protected int ukuranRoda;

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlahGear) {
        this.jumlahGear = jumlahGear;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuranRoda) {
        this.ukuranRoda = ukuranRoda;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Sepeda - Jenis: " + jenisSepeda + ", Jumlah Gear: " + jumlahGear + ", Ukuran Roda: " + ukuranRoda + " inci");
    }
}