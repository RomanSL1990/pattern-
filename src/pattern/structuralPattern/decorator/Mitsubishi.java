package pattern.structuralPattern.decorator;

public class Mitsubishi implements Car {
    @Override
    public String drive() {
        return "Mitsubishi " + Car.super.drive();
    }
}
