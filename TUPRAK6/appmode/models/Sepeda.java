package appmode.models;

public class Sepeda {
    protected String jenisSepeda;
    protected int jumlahGear;
    protected int ukuranRoda;

    public String getJenisSepeda(){
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda){
        this.jenisSepeda = jenisSepeda;
    }

    public int getJumlahGear(){
        return jumlahGear;
    }

    public void setJumlahGear(int jumlahGear){
        this.jumlahGear = jumlahGear;
    }

    public int setUkuranRoda(){
        return ukuranRoda;
    }

    public void getUkuranRoda(int ukuranRoda){
        this.ukuranRoda = ukuranRoda;
    }
    
}
