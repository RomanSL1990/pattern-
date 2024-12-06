package patternProectirovaniyaPorojaysie.FactoryMetod;

public class MitsubishiDepartment extends CarFactory {
    @Override
    public String crateCar() {
        return "Mitsubishi" + super.crateCar();
    }
}
