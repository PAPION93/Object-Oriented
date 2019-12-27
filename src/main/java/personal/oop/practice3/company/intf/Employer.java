package personal.oop.practice3.company.intf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employer implements Worker {

    private String name;
    private List<Worker> workers = new ArrayList<>();

    public Employer(String name){
        this.name = name;
    }

    @Override
    public void leaveHome(){
        System.out.println(name + " 집을 떠난다.");
    }

    @Override
    public void work() {
        System.out.println(name + "도 일한다.");
    }

    public void rememberWorkers(List<Worker> workers){
        this.workers = workers;
    }

    public void payBonus() {
        Collections.shuffle(workers);
        System.out.println("이번달은 " + workers.get(1).getName() + " 너 보너스!");
    }

    public void stopWork() {
        for (Worker worker : workers){
            System.out.println(worker.getName() +  "야 오늘은 여기까지해!");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
