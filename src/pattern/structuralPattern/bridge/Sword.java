package pattern.structuralPattern.bridge;


//Меч
public class Sword implements Weapon{
    final Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }
    @Override
    public void equip() {
        System.out.println("Достаю меч ");
        enchantment.onActivate();
    }

    @Override
    public void unequipped() {
        System.out.println("Убираю в ножны меч ");
        enchantment.onDeactivate();
    }

    @Override
    public void attack() {
        System.out.println("Атака мечом ");
        enchantment.apply();
    }
}
