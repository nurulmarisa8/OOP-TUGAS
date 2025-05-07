package appmode.models;

public class Motor extends Kendaraan {
    protected String jenisMotor;
    protected double kapasitasTangki;
    protected String tipeSuspensi;

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipeSuspensi) {
        this.tipeSuspensi = tipeSuspensi;
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Motor - Jenis: " + jenisMotor + ", Kapasitas Tangki: " + kapasitasTangki + "L, Tipe Suspensi: " + tipeSuspensi);
    }
}