package pattern.createPattern.AbstratFactory;

public interface Manager {
    default String sellCar(){
        return "Манагер продает";
    }

}
