package personal.oop.practice3;

import jdk.nashorn.internal.objects.annotations.Getter;
import personal.oop.practice3.intf.PlayBehavior;

import java.util.Random;


public class Player implements PlayBehavior {

    private String name;
    private String weapon;

    private WeaponEnum weaponEnum;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 무기를 선택한다.
     *
     * @param player
     */
    @Override
    public void selectWeapon(Player player) {
        setWeapon(weaponEnum.values()[getRandom()].getName());
        System.out.println(player.getName() + "는 " + player.getWeapon() + "를 선택했다.");
    }

    /**
     * 감정표현한다.
     *
     * @param player
     */
    @Override
    public void emote(Player player) {

    }

    private int getRandom() {
        return new Random().nextInt(3);
    }

    public String getName() {
        return name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

}
