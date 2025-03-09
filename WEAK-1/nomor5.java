import java.util.Scanner;

public class nomor5 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean hasUpperCase = false; // Untuk huruf besar
        boolean hasLowerCase = false; // Untuk huruf kecil
        boolean hasDigit = false;      // Untuk angka

        // Memeriksa setiap karakter dalam password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); 

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine(); // Membaca input password dari pengguna

        // Memvalidasi password
        if (isValidPassword(password)) {
            System.out.println("Password valid"); // Jika valid
        } else {
            System.out.println("Password tidak valid"); // Jika tidak valid
        }

        scanner.close();
    }
}