package pattern.createPattern.AbstratFactory;

public interface CarTeamFactory {

    Engineer getEngineer();
    Worker getWorker();
    Manager getManager();
}

