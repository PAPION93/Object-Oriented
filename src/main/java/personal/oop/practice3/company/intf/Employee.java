package personal.oop.practice3.company.intf;

public class Employee implements Worker {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void goCompany() {
        System.out.println( name + "회사간다.");
    }

    @Override
    public void work() {
        System.out.println( this.name + " 일한다.");
    }

}
