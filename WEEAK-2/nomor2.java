import java.util.Scanner;

public class nomor2 {
    int id;
    String name;
    int stock;
    double price;

    public boolean isAvailable() {
        return stock > 0;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Stock: " + stock);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nomor2 product = new nomor2();

        System.out.print("Product ID: ");
        product.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Product Name: ");
        product.name = scanner.nextLine();

        System.out.print("Stock: ");
        product.stock = scanner.nextInt();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.println("\nProduct Information:");
        product.displayProductInfo();

        scanner.close();
    }
}
