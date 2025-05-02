package TUPRAK5.gamemode.models;

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
    public Archer(String name) {
        super(name, 100, 15);
    }
}

class Wizard extends Hero {
    public Wizard(String name) {
        super(name, 80, 20);
    }
}

class Fighter extends Hero {
    public Fighter(String name) {
        this(name, 120, 10);
    }

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }
}