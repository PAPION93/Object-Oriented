package personal.oop.practice3.company.intf;

public class Employee implements Worker {

    private String name;

    public Employee(String name){
        this.name = name;
    }

    @Override
    public void leaveHome() {
        System.out.println( name + " 집을 떠난다.");
    }

    @Override
    public void work() {
        System.out.println( name + " 일한다.");
    }

    public String getName() {
        return name;
    }

}
