package pattern.structuralPattern.decorator;

public class MitsubishiWrapper implements Car {
    Car car;

    public MitsubishiWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String drive() {
        return car.drive();
    }
}
