package personal.oop.practice1.intf;

/**
 * The type Welsh corgi.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class WelshCorgi implements ShortLeg {
    @Override
    public void bark() {
        System.out.println("[웰시코기] 웰월웰월");
    }

    @Override
    public void step() {
        System.out.println("[웰시코기] 다리 짧아서 종종 걸음.");
    }

    @Override
    public void eat() {
        System.out.println("[웰시코기] 개밥 먹음");
    }
}
