package pattern.createPattern.AbstratFactory.MitsubishiDeportament;

import pattern.createPattern.AbstratFactory.Engineer;

public class MitsubishiEngineer implements Engineer {
    @Override
    public String createCar() {
        return Engineer.super.createCar() + " Mitsubishi";
    }
}
