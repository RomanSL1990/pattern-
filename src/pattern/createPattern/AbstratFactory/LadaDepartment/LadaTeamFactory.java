package pattern.createPattern.AbstratFactory.LadaDepartment;

import pattern.createPattern.AbstratFactory.Engineer;
import pattern.createPattern.AbstratFactory.Manager;
import pattern.createPattern.AbstratFactory.CarTeamFactory;
import pattern.createPattern.AbstratFactory.Worker;

public class LadaTeamFactory implements CarTeamFactory {

     @Override
    public Engineer getEngineer() {
        return new LadaEngineer();
    }

    @Override
    public Worker getWorker() {
        return new LadaWorker();
    }

    @Override
    public Manager getManager() {
        return new LadaManager();
    }
}
