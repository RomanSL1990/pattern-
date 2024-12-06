package patternProectirovaniyaPorojaysie.AbstratFactory;

public interface Engineer {

    default String createCar(){
        return "Инженер разрабатывает чертеж ";
    }

}
