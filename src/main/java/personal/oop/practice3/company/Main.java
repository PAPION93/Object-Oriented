package personal.oop.practice3.company;

import personal.oop.practice3.company.intf.*;

public class Main {
    public static void main(String[] args) {

        Worker jun = new Employee("Jun");
        Worker cho = new Employee("Cho");
        Worker ceo = new Employer("Park");

        jun.leaveHome();
        cho.leaveHome();
        ceo.leaveHome();

        System.out.println("-----------출근중");

        ResearchFloor rsh = new ResearchFloor();
        rsh.comeToWork(jun);
        rsh.comeToWork(cho);
        rsh.comeToWork(ceo);

        System.out.println("-----------출근 완료");
        rsh.checkWorker();

        System.out.println("-----------업무 시작");
        jun.work();
        cho.work();
        ceo.work();

        System.out.println("-----------업무 종료");
        ((Employer) ceo).stopWork();

        System.out.println("-----------보너스");
        ((Employer) ceo).payBonus();

    }
}
