package personal.oop.practice3.company;

import personal.oop.practice3.company.intf.Employee;
import personal.oop.practice3.company.intf.Employer;

public class Main {
    public static void main(String[] args) {

        Employer ceo = new Employer();

        Employee jun = new Employee("jun");
        jun.goCompany();
        jun.work();

        ceo.payBonus(jun.getName());
    }
}
