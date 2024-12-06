package pattern.createPattern.AbstratFactory.MitsubishiDeportament;

import pattern.createPattern.AbstratFactory.Worker;

public class MitsubishiWorker implements Worker {

    @Override
    public String buildCar() {
        return Worker.super.buildCar() + " Mitsubishi";
    }
}
