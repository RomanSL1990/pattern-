package pattern.createPattern.AbstratFactory.LadaDepartment;

import pattern.createPattern.AbstratFactory.Engineer;

public class LadaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Лады";
    }
}
