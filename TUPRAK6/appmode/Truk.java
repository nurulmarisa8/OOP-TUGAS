public class Truk extends Kendaraan implements IBergerak {
    public Truk(String id, String merek, String model, String warna, int tahunProduksi) {
        super(id, merek, model, warna, tahunProduksi);
    }

    public String getTipeKendaraan() { 
        return "Truk"; }


    public boolean bergerak() { 
        return true; }


    public boolean berhenti() { 
        return true; }
        

    public double getKecepatan() { 
        return 0.0; }


    public void setKecepatan(double kecepatan) {
        
    }
}