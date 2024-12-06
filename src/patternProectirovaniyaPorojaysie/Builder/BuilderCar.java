package patternProectirovaniyaPorojaysie.Builder;

public interface BuilderCar {


    void setVin(int vin);
    void setModel(String model);
    void setPowerEngine(int powerEngine);
    Car buildCar();
}
