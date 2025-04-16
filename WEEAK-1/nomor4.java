import java.util.Scanner;

public class nomor4 {
    public static long faktorial(long n) {
        if (n == 0 || n == 1) { 
            return 1;
        } else {
            return n * faktorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        long n = scanner.nextInt(); 


        long hasil = faktorial(n);
        
        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
        
        scanner.close();
    }
}