package patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment;

import patternProectirovaniyaPorojaysie.AbstratFactory.Engineer;

public class LadaEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Лады";
    }
}
