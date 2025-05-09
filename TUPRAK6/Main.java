public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("M001", "Toyota", "Camry", "Silver", 2020, 4, 2.5, "Bensin");
        Kendaraan motor = new Motor("M002", "Honda", "PCX", "Black", 2021, "Matic", 8.0);
        Kendaraan sepeda = new Sepeda("S001", "United", "Bike", "Red", 2019, "Mountain", 21);
        Kendaraan truk = new Truk("T001", "Isuzu", "Elf", "White", 2018);

        System.out.println("Mobil: " + mobil.getTipeKendaraan() + ", Merek: " + mobil.getMerek());
        System.out.println("Motor: " + motor.getTipeKendaraan() + ", Merek: " + motor.getMerek());
        System.out.println("Sepeda: " + sepeda.getTipeKendaraan() + ", Merek: " + sepeda.getMerek());
        System.out.println("Truk: " + truk.getTipeKendaraan() + ", Merek: " + truk.getMerek());
    }
}