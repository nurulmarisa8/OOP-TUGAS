public class Weapon {
    private String name;
    private int damage;

    public Weapon() {
        this.name = "Classic";
        this.damage = 20;
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() {
        System.out.println(name + " digunakan untuk menyerang!");
        return damage;
    }
}
