package personal.oop.practice3;

import personal.oop.practice3.intf.BattleGround;

import java.util.ArrayList;
import java.util.List;

public class Erangel implements BattleGround {

    private List<Player> players;

    public Erangel() {
        this.players = new ArrayList<>();
    }

    @Override
    public void enterToBattleGround(List<Player> players) {

        System.out.println("에란겔 입장");

        for (Player player : players) {
            player.selectWeapon(player);
        }

    }

}
