package pattern.createPattern.AbstratFactory.LadaDepartment;

import pattern.createPattern.AbstratFactory.Manager;

public class LadaManager implements Manager {

    @Override
    public String sellCar() {
        return Manager.super.sellCar() + " Ладу";
    }
}
