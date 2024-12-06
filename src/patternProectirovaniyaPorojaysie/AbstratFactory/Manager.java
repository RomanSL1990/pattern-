package   patternProectirovaniyaPorojaysie.AbstratFactory;

public interface Manager {
    default String sellCar(){
        return "Манагер продает";
    }

}
