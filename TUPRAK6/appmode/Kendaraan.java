public abstract class Kendaraan {
    private String id;
    private String merek;
    private String model;
    private String warna;
    private int tahunProduksi;

    public Kendaraan(String id, String merek, String model, String warna, int tahunProduksi) {
        this.id = id;
        this.merek = merek;
        this.model = model;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    public String getId() { 
        return id; 
    }


    public String getMerek() { 
        return merek; 
    }


    public String getModel() { 
        return model; 
    }


    public String getWarna() { 
        return warna; 
    }


    public int getTahunProduksi() { 
        return tahunProduksi; 
    }


    public void setWarna(String warna) { 
        this.warna = warna; 
    }


    public void setTahunProduksi(int tahunProduksi) { 
        this.tahunProduksi = tahunProduksi; 
    }


    public abstract String getTipeKendaraan();

    public abstract boolean berhenti();

    public abstract double getKecepatan();

    public abstract void setKecepatan(double kecepatan);
}