import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String input = scanner.nextLine();

        String[] kata = input.split(" ");
        

        String result = "";

        for (String word : kata) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        
        System.out.println(result);
        
        scanner.close();

        
        
    }

}




