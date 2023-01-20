public class App {
    public static void main(String[] args) throws Exception {
        
        Weapon sword = new Weapon();

        sword.name = "Ben's Excalibur";
        sword.damage = 69;
        sword.rarity = "rare";
        sword.addDamage(69);
        System.out.println(sword.showWeaponNameAndRarity());

        Character barbarian = new Character();

        barbarian.name = "Ben";
        barbarian.sayMyName();
        barbarian.attack();

    }
}
