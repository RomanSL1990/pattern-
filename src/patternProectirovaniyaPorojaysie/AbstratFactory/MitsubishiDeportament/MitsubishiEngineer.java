package patternProectirovaniyaPorojaysie.AbstratFactory.MitsubishiDeportament;

import patternProectirovaniyaPorojaysie.AbstratFactory.Engineer;

public class MitsubishiEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Mitsubishi";
    }
}
