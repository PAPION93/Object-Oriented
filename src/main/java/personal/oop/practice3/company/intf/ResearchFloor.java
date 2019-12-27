package personal.oop.practice3.company.intf;

import java.util.ArrayList;
import java.util.List;

public class ResearchFloor implements Building{

    private List<Worker> workers = new ArrayList<>();
    private Employer ceo;

    @Override
    public boolean comeToWork(Worker worker) {
        if( worker instanceof Employee ){

            System.out.println( worker.getName() + ": 안녕하세요");
            workers.add(worker);

        }else if( worker instanceof Employer ){

            System.out.println( "안녕하세요 " + worker.getName() + " 사장님, 반갑지만 사장님방으로 가세요.");
            ceo = (Employer) worker;
            ceo.rememberWorkers(workers);

        }else{
            return false;
        }
        return true;
    }

    @Override
    public void checkWorker(){
        for (Worker worker : workers) {
            System.out.println(worker.getName() + " 출근 확인");
        }
    }
}
