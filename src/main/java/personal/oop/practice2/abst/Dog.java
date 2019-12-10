package personal.oop.practice2.abst;

public abstract class Dog extends Animal{

    public abstract void bite();

    public void bark(){
        System.out.println("[Dog] 짖다");
    }

}
