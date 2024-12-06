package patternProectirovaniyaPorojaysie.AbstratFactory.MitsubishiDeportament;

import patternProectirovaniyaPorojaysie.AbstratFactory.Worker;

public class MitsubishiWorker implements Worker {

    @Override
    public String buildCar() {
        return Worker.super.buildCar() + " Mitsubishi";
    }
}
