package TUPRAK5.models;

public class Hero {
    String name;
    double attackPower, health;


    public Hero(String nameInput, double attackInput, double healthInput){
        this.name = nameInput;
        this.attackPower = attackInput;
        this.health = healthInput;
    }

    public void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health);
        System.out.println("Power: " + this.attackPower);
    }
    
}
