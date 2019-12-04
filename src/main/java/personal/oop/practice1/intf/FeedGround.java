package personal.oop.practice1.intf;

/**
 * The type Feed ground.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-04
 */
public class FeedGround {

    private Animal animal;

    /**
     * 먹이 주는 장소에 동물 입장.
     *
     * @param animal the animal
     */
    public FeedGround(Animal animal) {
        this.animal = animal;
    }

    /**
     * 동물한테 먹이 주기.
     */
    public void feed() {
        animal.eat();
    }
}
