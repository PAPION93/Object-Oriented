package personal.oop.practice1.intf;

/**
 * The type Dachshund.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class Dachshund implements ShortLeg {
    @Override
    public void step() {
        System.out.println("[닥스훈트] 다리 짧아서 종종 걸음.");
    }

    @Override
    public void bark() {
        System.out.println("[닥스훈트] 닥월닥월월");
    }

    @Override
    public void eat() {
        System.out.println("[닥스훈트] 개밥 먹음");
    }
}
