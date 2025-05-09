import java.util.Date;

public interface IServiceable {
    boolean periksaKondisi();
    void lakukanServis();
    Date getWaktuServisTerakhir();
    void setWaktuServis(Date waktu);
    double hitungBiayaServis();
}