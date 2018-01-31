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


    public int spin() {

        Fruit rF0 = wheels.get(0).getRandomFruit();
        Fruit rF1 = wheels.get(1).getRandomFruit();
        Fruit rF2 = wheels.get(2).getRandomFruit();

        if (rF0 == rF1 && rF1 == rF2) {
            return (rF0.getValue() * 3);
        } else {
            return 0;
        }
    }

}
