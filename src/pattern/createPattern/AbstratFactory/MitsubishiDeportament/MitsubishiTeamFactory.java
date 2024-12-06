package pattern.createPattern.AbstratFactory.MitsubishiDeportament;

import pattern.createPattern.AbstratFactory.Engineer;
import pattern.createPattern.AbstratFactory.Manager;
import pattern.createPattern.AbstratFactory.CarTeamFactory;
import pattern.createPattern.AbstratFactory.Worker;

public class MitsubishiTeamFactory implements CarTeamFactory {

     @Override
    public Engineer getEngineer() {
        return new MitsubishiEngineer();
    }

    @Override
    public Worker getWorker() {
        return new MitsubishiWorker();
    }

    @Override
    public Manager getManager() {
        return new MitsubishiManager();
    }
}
