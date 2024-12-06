package patternProectirovaniyaPorojaysie.AbstratFactory.MitsubishiDeportament;

import patternProectirovaniyaPorojaysie.AbstratFactory.CarTeamFactory;
import patternProectirovaniyaPorojaysie.AbstratFactory.Engineer;
import patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment.LadaEngineer;
import patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment.LadaManager;
import patternProectirovaniyaPorojaysie.AbstratFactory.LadaDepartment.LadaWorker;
import patternProectirovaniyaPorojaysie.AbstratFactory.Manager;
import patternProectirovaniyaPorojaysie.AbstratFactory.Worker;

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
