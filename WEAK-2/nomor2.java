import java.util.Scanner;

public class nomor2 {
    int id; 
    String name; 
    int stock;
    double price; 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0; 
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + getId());
        System.out.println("Product Name: " + getName());
        System.out.println("Stock: " + getStock());
        System.out.println("Price: $" + getPrice());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        nomor2 product = new nomor2();

        System.out.print("Enter Product ID: ");
        product.setId(scanner.nextInt()); 

        scanner.nextLine(); 

        System.out.print("Enter Product Name: ");
        product.setName(scanner.nextLine()); 

        System.out.print("Enter Stock: ");
        product.setStock(scanner.nextInt()); 

        System.out.print("Enter Price: ");
        product.setPrice(scanner.nextDouble()); 

        System.out.println("\nProduct Information:");
        product.displayProductInfo();

        scanner.close(); 
    }
}