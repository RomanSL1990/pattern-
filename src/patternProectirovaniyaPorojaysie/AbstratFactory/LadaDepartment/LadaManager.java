package patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment;

import patternProectirovaniyaPorojaysie.AbstratFactory.Manager;

public class LadaManager implements Manager {

    @Override
    public String sellCar() {
        return Manager.super.sellCar() + " Ладу";
    }
}
