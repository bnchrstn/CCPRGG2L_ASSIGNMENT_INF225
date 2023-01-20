public class Weapon {
    
    String name;
    int damage;
    String rarity;

    public void addDamage(int additionalDamage) {
        int newDamage = damage + additionalDamage;
        System.out.println("Damage increased from " + damage + " to " + newDamage);
        this.damage = newDamage;
    }

    public void sayMyName2() {
        System.out.println("My sword is a " + name);

    }

    public void sayMyDamage() {
        System.out.println("its damage is " + damage);

    }

    public void sayMyRarity() {
        System.out.println("its rarity is " + rarity);

    }

    public String showWeaponNameAndRarity() {
        return this.name + " " + this.rarity;
    }

}
