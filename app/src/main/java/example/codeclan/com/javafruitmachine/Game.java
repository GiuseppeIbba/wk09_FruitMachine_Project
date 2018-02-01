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

        int s0 = wheels.get(0).getCount();
        int s1 = wheels.get(1).getCount();
        int s2 = wheels.get(2).getCount();

        int rF0Index = wheels.get(0).getFruitIndex(rF0);
        int rF1Index = wheels.get(1).getFruitIndex(rF1);
        int rF2Index = wheels.get(2).getFruitIndex(rF2);

        Fruit rF0Next = wheels.get(0).getNextFruit(s0, rF0Index);
        Fruit rF1Next = wheels.get(1).getNextFruit(s1, rF1Index);
        Fruit rF2Next = wheels.get(2).getNextFruit(s2, rF2Index);


//        if ((rF0 == rF1 && rF0 != rF2) || (rF0 == rF2 && rF1 != rF2) || (rF1 == rF2 && rF1 != rF0)) {
//
//            if (rF0 == rF1 && canDoNudge(rF2Next, rF2Prev, rF1)) { //if first and second wheel fruits are equal
//                rF2 = nudge(rF2Next, rF2Prev, rF1);
//            } else if (rF0 == rF2 && canDoNudge(rF1Next, rF1Prev, rF0)) { //if first and third wheel fruits are equal
//                rF1 = nudge(rF1Next, rF1Prev, rF0);
//            } else if (rF1 == rF2 && canDoNudge(rF0Next, rF0Prev, rF2)) { //if second and third wheel fruits are equal
//                rF0 = nudge(rF0Next, rF0Prev, rF2);
//            }
//        }
        return calculateWinning(rF0, rF1, rF2);

    }

    public int calculateWinning(Fruit rF0, Fruit rF1, Fruit rF2) {
        if (rF0 == rF1 && rF1 == rF2) {
            return (rF0.getValue() * 3);
        } else {
            return 0;
        }
    }

    //////////////////////
        ////////////////////////////
//        Fruit rF0 = wheels.get(0).getRandomFruit();
//        Fruit rF1 = wheels.get(1).getRandomFruit();
//        Fruit rF2 = wheels.get(2).getRandomFruit();
//
//        if (rF0 == rF1 && rF1 == rF2) {
//            return (rF0.getValue() * 3);
//        } else {
//            return 0;
//        }
//    }
//////////////////////////////////
    /////////////////////////////////////
    public String play() {
        if (this.player.getCredit() > 0) {
            this.player.changeCredit(-1);
        } else {
            return "GAME OVER";
        }
        int winnings = spin();//stock spin() in a variable
        if (winnings > 0) {
            winner(winnings);
            return "You win " + winnings + " credits";
        } else {
            return "";
        }

    }


    public void winner(int calculateWinning) {
        this.player.changeCredit(calculateWinning);
    }
}




