package personal.oop.practice3.company.intf;

public class Employer implements Worker {

    @Override
    public void work() {
        System.out.println("사장도 일한다.");
    }

    public void paySalary(){
        System.out.println("월급준다.");
    }

}
