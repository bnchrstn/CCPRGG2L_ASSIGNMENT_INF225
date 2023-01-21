public class Weapon {
    
    String name;
    int damage;
    String rarity;

    public void addDamage(int additionalDamage) {
        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + newDamage);
        this.damage = newDamage;
    }

    public String showWeaponNameAndRarity() {
        return this.name + " : " + this.rarity;
    }

}
