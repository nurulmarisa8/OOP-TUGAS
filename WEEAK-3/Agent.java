public class Agent {
    private String name;
    private int health;
    private Weapon weapon; 
    private Armor armor;   

    public Agent() {
        this.name = "Unknown";
        this.health = 100;
        this.weapon = new Weapon();
        this.armor = new Armor();
    }

    public Agent(String name, int health, Weapon weapon, Armor armor) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.armor = armor;
    }

    public void attack(Agent enemy) {
        int damage = weapon.getDamage();
        int defense = armor.getDefense();
        int finalDamage = damage - defense;

        if (finalDamage < 0) finalDamage = 0;
        enemy.health -= finalDamage;

        System.out.println(name + " menyerang " + enemy.name + " dan memberikan " + finalDamage + " damage!");
    }

    public void checkStatus() {
        System.out.println("Agent: " + name + " | HP: " + health);
    }
}
