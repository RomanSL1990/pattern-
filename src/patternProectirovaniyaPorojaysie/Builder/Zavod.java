package patternProectirovaniyaPorojaysie.Builder;

public class Zavod {

    BuilderCar builderCar;

    public Zavod(BuilderCar builderCar) {
        this.builderCar = builderCar;
    }

    public void createSportCar(){
        builderCar.setVin(12412412);
        builderCar.setModel("Ferrari");
        builderCar.setPowerEngine(1000);
    }

    public void createBuss(){
        builderCar.setVin(11111);
        builderCar.setModel("GMA");
        builderCar.setPowerEngine(650);
    }


}
