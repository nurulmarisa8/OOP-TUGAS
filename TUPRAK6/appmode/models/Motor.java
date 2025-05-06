package appmode.models;

public class Motor {
    protected String jenisMotor;
    protected double kapasitasTangki;
    protected String tipeSuspensi;


    public String getJenisMotor(){
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor){
        this.jenisMotor = jenisMotor;
    }

    public double getKapasitasTengki(){
        return kapasitasTangki;
    }

    public void setKapaistasTangki(double kapasitasTangki){
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getTipeSusptensi(){
        return tipeSuspensi;
    }

    public void setTipeSusptensi(String tipeSuspensi){
        this.tipeSuspensi = tipeSuspensi;
    }

    
}
