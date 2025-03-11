import java.util.Scanner;

public class nomor5 {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean uppercase = false; // huruf besar
        boolean lowercase = false; // huruf kecil
        boolean digit = false;      // angka

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); 

            if (Character.isUpperCase(c)) {
                uppercase = true;
            }
            else if (Character.isLowerCase(c)) {
                lowercase = true;
            }
            else if (Character.isDigit(c)) {
                digit = true;
            }
        }

        return uppercase && lowercase && digit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine(); 

        // Valid
        if (isValidPassword(password)) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid"); 
        }

        scanner.close();
    }
}