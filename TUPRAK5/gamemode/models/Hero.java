package gamemode.models;

public class Hero {
    protected String name;
    protected int health;
    protected int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}

class Archer extends Hero {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
}

class Wizard extends Hero {
    public Wizard(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
}

class Fighter extends Hero {
    public Fighter(String name, int health, int attackPower) {
        this(name); 
        this.health = health;
        this.attackPower = attackPower;
    }

    public Fighter(String name) {
        super(name, 0, 0); 
    }
}
