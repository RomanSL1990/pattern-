package pattern.structuralPattern.facade;

public class JobDepartment {
    private boolean runningJob;

    public boolean isRunningJob(){
        return runningJob;
    }

    public void startJob(){
        System.out.println("Начата работа над авто");
        runningJob = true;
    }

    public void finishJob(){
        System.out.println("Работа остановлена");
        runningJob = false;
    }

}
