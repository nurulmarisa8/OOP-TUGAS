import java.util.Date;

public class Mobil extends Kendaraan implements IServiceable {
    private int jumlahPintu;
    private double kapasitasMesin;
    private String bahanBakar;

    public Mobil(String id, String merek, String model, String warna, int tahunProduksi, int jumlahPintu, double kapasitasMesin, String bahanBakar) {
        super(id, merek, model, warna, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.kapasitasMesin = kapasitasMesin;
        this.bahanBakar = bahanBakar;
    }

    public String getTipeKendaraan() { 
        return "Mobil"; }

    public boolean berhenti() { 
        return true; 
    }

    public double getKecepatan() { 
        return 0.0; 
    }

    public void setKecepatan(double kecepatan) {

    }

    public boolean periksaKondisi() { 
        return true; }

    public void lakukanServis() {

    }
    public Date getWaktuServisTerakhir() { 
        return new Date(); 
    }

    public void setWaktuServis(Date waktu) {}
    public double hitungBiayaServis() { 
        return 0.0; 
    }


    public int getJumlahPintu() { 
        return jumlahPintu; 
    }

    public void setJumlahPintu(int jumlahPintu) { 
        this.jumlahPintu = jumlahPintu; 
    }

    public double getKapasitasMesin() { 
        return kapasitasMesin; 
    }

    public void setKapasitasMesin(double kapasitasMesin) { 
        this.kapasitasMesin = kapasitasMesin; 
    }

    public String getBahanBakar() { 
        return bahanBakar; 
    }

    public void setBahanBakar(String bahanBakar) { 
        this.bahanBakar = bahanBakar; 
    }
}