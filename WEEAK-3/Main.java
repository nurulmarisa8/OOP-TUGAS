public class Main {
    public static void main(String[] args) {
        Weapon phantom = new Weapon("Phantom", 30);
        Armor lightArmor = new Armor(10);
        Agent jett = new Agent("Jett", 100, phantom, lightArmor);

        Weapon vandal = new Weapon("Vandal", 35);
        Armor heavyArmor = new Armor(15);
        Agent phoenix = new Agent("Phoenix", 100, vandal, heavyArmor);

        jett.attack(phoenix);
        phoenix.attack(jett);

        jett.checkStatus();
        phoenix.checkStatus();
    }
}
