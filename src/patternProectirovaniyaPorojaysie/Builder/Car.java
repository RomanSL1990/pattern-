package patternProectirovaniyaPorojaysie.Builder;

import java.util.Objects;

public class Car {

    private int vin;
    private String model;
    private int powerEngine;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vin == car.vin && powerEngine == car.powerEngine && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin, model, powerEngine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", model='" + model + '\'' +
                ", powerEngine=" + powerEngine +
                '}';
    }
}
