import java.util.Scanner;

public class nomor1 {
    String name;
    int age;
    boolean isMale;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nomor1 person = new nomor1();

        System.out.print("Enter name: ");
        person.name = scanner.nextLine();

        System.out.print("Enter age: ");
        person.age = scanner.nextInt();

        System.out.print("Enter gender (true for Male, false for Female): ");
        person.isMale = scanner.nextBoolean();

        System.out.println("\nPerson Information:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + (person.isMale ? "Male" : "Female"));

        scanner.close();
    }
}
