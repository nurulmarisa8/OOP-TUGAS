import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate tanggal = LocalDate.parse(input, inputFormat);

            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("d MMMM yyyy");
            System.out.println(tanggal.format(outputFormat));

        } catch (Exception e) {
            System.out.println("Format Salah! Gunakan dd-MM-yyyy");
        }

        scanner.close();
    }
}