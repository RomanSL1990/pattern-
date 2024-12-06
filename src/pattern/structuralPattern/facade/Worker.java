package pattern.structuralPattern.facade;

public class Worker {
        public void doJob(JobDepartment jobDepartment){
        if (jobDepartment.isRunningJob()){
            System.out.println("Рабочий пристуил к сборке авто");
        }else {
            System.out.println("Рабочий прохлаждается");
        }
    }
}
