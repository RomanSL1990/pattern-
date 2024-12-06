package patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment;

import patternProectirovaniyaPorojaysie.AbstratFactory.Worker;

public class LadaWorker implements Worker {

    @Override
    public String buildCar() {
        return Worker.super.buildCar() + " Ладу";
    }
}
