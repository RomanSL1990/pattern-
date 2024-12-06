package pattern.structuralPattern.bridge;

public class FireEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("Оружие загорелось");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Оружие погасло");
    }

    @Override
    public void apply() {
        System.out.println("Применили огненную актау на противника");
    }
}
