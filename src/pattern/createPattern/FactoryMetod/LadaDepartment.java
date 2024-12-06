package pattern.createPattern.FactoryMetod;

public class LadaDepartment extends CarFactory {
    @Override
    public String crateCar() {
        return "Lada" + super.crateCar();
    }
}
