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

}
