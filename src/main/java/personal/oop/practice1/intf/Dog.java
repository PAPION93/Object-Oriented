package personal.oop.practice1.intf;

/**
 * The interface Dog.
 *
 * @author cho_jeong_ha
 * @project oop -practice
 * @update 2019 -12-02
 */
public interface Dog extends Animal {
    /**
     * 개는 동물이다. DOG IS-A ANIMAL
     * 개(명사)는 짖는다(동사).
     */
    void bark();
}
