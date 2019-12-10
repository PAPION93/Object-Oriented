package personal.oop.practice2;

import personal.oop.practice2.abst.Maltese;
import personal.oop.practice2.intf.*;

/**
 *  abstract 와 interface 차이점 알기
 *  - abstract 는 일반메소드는 강제 오버라이딩아님
 *  - interface 는 모든 클래스 오버라이딩
 */
public class Practice {

    public static void main(String[] args) {

        // abstract
        System.out.println("-------- Abstract ");
        personal.oop.practice2.abst.Maltese maltese = new Maltese();
        maltese.bark();
        System.out.println();

        // interface
        // Dog Interface 로 생성된 instance 라서 bite와 Animal 의 eat, sleep 만 할 수 있음
        System.out.println("-------- Dog Interface");
        Dog jangguni = new personal.oop.practice2.intf.Maltese();
        Dog mme = new Shepherd();
        jangguni.eat();
        jangguni.sleep();
        jangguni.bite();
        mme.eat();
        System.out.println();

        System.out.println("-------- BlackFur Interface");
        BlackFur spd = new Shepherd();
        spd.blackMolting();
        System.out.println();

        System.out.println("-------- Shepherd Class");
        Shepherd realspd = new Shepherd();
        realspd.test();
        System.out.println();
    }
}
