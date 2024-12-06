package pattern.structuralPattern.bridge;

// посох
public class Staff implements Weapon{

    final Enchantment enchantment;

    public Staff(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void equip() {
        System.out.println("Взял посох в руки");
        enchantment.onActivate();
    }

    @Override
    public void unequipped() {
        System.out.println("Посох убран");
        enchantment.onDeactivate();
    }

    @Override
    public void attack() {
        System.out.println("Акака посохом");
        enchantment.apply();
    }
}
