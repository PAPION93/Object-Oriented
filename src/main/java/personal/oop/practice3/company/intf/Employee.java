package personal.oop.practice3.company.intf;

public class Employee implements Worker {

    @Override
    public void work() {
        System.out.println("직원은 일한다.");
    }

}
