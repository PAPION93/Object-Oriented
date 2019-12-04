package personal.oop.practice1.intf;

/**
 * The type Eagle.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class Eagle implements Bird {
    @Override
    public void twitter() {
        System.out.println("[독수리] 삐에에에에엑?");
    }

    @Override
    public void eat() {
        System.out.println("[독수리] 맹수, 육식...");
    }
}
