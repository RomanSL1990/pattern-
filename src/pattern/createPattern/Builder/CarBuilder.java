package pattern.createPattern.Builder;

public class CarBuilder implements BuilderCar{

    private Car car;

    public CarBuilder(){
        car = new Car();
    }

    @Override
    public void setVin(int vin) {
        car.setVin(vin);
    }

    @Override
    public void setModel(String model) {
        car.setModel(model);
    }

    @Override
    public void setPowerEngine(int powerEngine) {
        car.setPowerEngine(powerEngine);
    }

    @Override
    public Car buildCar() {
        return car;
    }

}
