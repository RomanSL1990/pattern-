package patternProectirovaniyaPorojaysie.AbstratFactory.MitsubishiDeportament;

import patternProectirovaniyaPorojaysie.AbstratFactory.Manager;

public class MitsubishiManager implements Manager {

    @Override
    public String sellCar() {
        return Manager.super.sellCar() + " Mitsubishi";
    }
}
