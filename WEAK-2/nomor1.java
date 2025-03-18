import java.util.Scanner;

public class nomor1 {
    String name; 
    int age; 
    boolean isMale; 

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Male" : "Female"; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        nomor1 person = new nomor1();

        System.out.print("Enter name: ");
        person.setName(scanner.nextLine()); 

        System.out.print("Enter age: ");
        person.setAge(scanner.nextInt()); 

        System.out.print("Enter gender (true for Male, false for Female): ");
        person.setGender(scanner.nextBoolean()); 

        System.out.println("\nPerson Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        scanner.close(); 
    }
}