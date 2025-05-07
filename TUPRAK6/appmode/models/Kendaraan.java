package appmode.models;

public class Kendaraan {
    protected String id;
    protected String merek;
    protected String model;
    protected int tahunpProduksi;
    protected String warna;

    public String getId() {
        return id;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel(){
        return model;
    }

    public void setTahunProduksi(int tahunpProduksi){
        this.tahunpProduksi = tahunpProduksi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getDetail() {
        return "ID: " + id + ", Merek: " + merek + ", Model: " + model + ", Tahun: " + tahunProduksi + ", Warna: " + warna;
    }
    
}
