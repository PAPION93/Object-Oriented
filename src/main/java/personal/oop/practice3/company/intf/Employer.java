package personal.oop.practice3.company.intf;

public class Employer implements Worker {

    @Override
    public void goCompany(){
        System.out.println("사장 회사간다.");
    }

    @Override
    public void work() {
        System.out.println("사장도 일한다.");
    }

    public void payBonus(String name) {
        System.out.println(name + "에게 서비스 준다.");
    }

}
