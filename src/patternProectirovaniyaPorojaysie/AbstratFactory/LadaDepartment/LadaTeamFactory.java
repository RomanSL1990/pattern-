package patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment;

import patternProectirovaniyaPorojaysie.AbstratFactory.CarTeamFactory;
import patternProectirovaniyaPorojaysie.AbstratFactory.Engineer;
import patternProectirovaniyaPorojaysie.AbstratFactory.Manager;
import patternProectirovaniyaPorojaysie.AbstratFactory.Worker;

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
