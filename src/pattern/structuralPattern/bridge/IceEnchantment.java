package pattern.structuralPattern.bridge;

public class IceEnchantment implements Enchantment{
    @Override
    public void onActivate() {
        System.out.println("Оружие замерзает");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Оружие остывает");
    }

    @Override
    public void apply() {
        System.out.println("Ударило противника холодом");
    }
}
