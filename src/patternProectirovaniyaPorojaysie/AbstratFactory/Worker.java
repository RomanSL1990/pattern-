package patternProectirovaniyaPorojaysie.AbstratFactory;

public interface Worker {

    default String buildCar(){
        return "Рабочий собирает машину";
    }
}
