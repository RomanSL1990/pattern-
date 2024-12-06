package pattern.createPattern.AbstratFactory.LadaDepartment;

import pattern.createPattern.AbstratFactory.Worker;

public class LadaWorker implements Worker {

    @Override
    public String buildCar() {
        return Worker.super.buildCar() + " Ладу";
    }
}
