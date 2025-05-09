import java.util.Date;

public class Motor extends Kendaraan implements IServiceable {
    private String jenisMotor;
    private double kapasitasTangki;

    public Motor(String id, String merek, String model, String warna, int tahunProduksi, String jenisMotor, double kapasitasTangki) {
        super(id, merek, model, warna, tahunProduksi);
        this.jenisMotor = jenisMotor;
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getTipeKendaraan() { 
        return "Motor"; 
    }

    public boolean berhenti() { 
        return true; 
    }

    public double getKecepatan() {
         return 0.0; 
    }

    public void setKecepatan(double kecepatan) {
        
    }
    public boolean periksaKondisi() { 
        return true; 
    }

    public void lakukanServis() {

    }

    public Date getWaktuServisTerakhir() { 
        return new Date(); 
    }

    public void setWaktuServis(Date waktu) {

    }

    public double hitungBiayaServis() { 
        return 0.0;
    }

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
    
}