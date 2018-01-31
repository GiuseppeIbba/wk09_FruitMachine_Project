package example.codeclan.com.javafruitmachine;

import java.util.ArrayList;

/**
 * Created by user on 31/01/2018.
 */

public class Game {

    private Player player;
    ArrayList<Wheel> wheels;


    public Game(Player player, ArrayList<Wheel> wheels) {
        this.player = player;
        this.wheels = wheels;
    }

    public String getPlayerName() {
        return this.player.getName();
    }

    public int getPlayerCredit() {
        return this.player.getCredit();
    }
}
