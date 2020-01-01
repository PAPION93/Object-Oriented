package personal.oop.practice3;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private int playerCount;
    private List<Player> playerList;

    public Player(int playerCount) {

        this.playerCount = playerCount;
        this.playerList = new ArrayList<>();

    }

    /**
     * 플레이어들은 로비로 입장
     */
    public void enterToLobby(){

        for (int i = 0; i < playerCount; i++) {
            playerList.add();
        }

    }

}
