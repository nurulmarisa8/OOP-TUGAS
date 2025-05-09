package appmode.models;

public class Mobil {
    protected int jumlahPintu;
    protected double kapasitasMesin;
    protected int jumlahKursi;
    protected String bahanBakar;

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu = jumlahPintu;

    }

    public double getKapasitasMesin(){
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitasMesin){
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getJumlahKursi(){
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi){
        this.jumlahKursi = jumlahKursi;
    }

    public String getBahaBakar(){
        return bahanBakar;
    }

    public void setBahanBakar(String bahanbakar){
        this.bahanBakar = bahanbakar;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Mobil - Jumlah Pintu: " + jumlahPintu + ", Kapasitas Mesin: " + kapasitasMesin + "L, Jumlah Kursi: " + jumlahKursi + ", Bahan Bakar: " + bahanBakar);
    }


}
