package pattern.createPattern.AbstratFactory.MitsubishiDeportament;

import pattern.createPattern.AbstratFactory.Manager;

public class MitsubishiManager implements Manager {

    @Override
    public String sellCar() {
        return Manager.super.sellCar() + " Mitsubishi";
    }
}
