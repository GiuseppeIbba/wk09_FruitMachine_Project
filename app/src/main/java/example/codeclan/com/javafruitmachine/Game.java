package example.codeclan.com.javafruitmachine;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * Created by user on 31/01/2018.
 */

public class Game {

    private Player player;
    ArrayList<Wheel> wheels;

    private int spinCounter = 0;


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

        spinCounter++;

        System.out.print("spinCounter number: " + spinCounter + '\n');

        Fruit rF0 = wheels.get(0).getRandomFruit();
        Fruit rF1 = wheels.get(1).getRandomFruit();
        Fruit rF2 = wheels.get(2).getRandomFruit();

        System.out.println("First wheelspin");
        System.out.println(rF0.getName());
        System.out.println(rF1.getName());
        System.out.println(rF2.getName());



//        wheels.get(0).setHolder();   //TO block the wheels
//        wheels.get(1).setHolder();
//        wheels.get(2).setHolder();


        if (spinCounter == 1 && rF0 == rF1 && rF1 == rF2) {
            System.out.println(" calculateWinning 0 in if spinCounter == 1 && rF0 == rF1 && rF1 == rF2 ");
            System.out.println(rF0.getName());
            System.out.println(rF1.getName());
            System.out.println(rF2.getName());
            return calculateWinning(rF0, rF1, rF2);
        }



        if (spinCounter >= 1) {


            if (wheels.get(0).Holder() == true && wheels.get(1).Holder() == true && wheels.get(2).Holder() == false) {
                rF2 = wheels.get(2).getRandomFruit();
            }
            if (wheels.get(0).Holder() == true && wheels.get(2).Holder() == true && wheels.get(1).Holder() == false) {
                rF1 = wheels.get(1).getRandomFruit();
            }
            if (wheels.get(1).Holder() == true && wheels.get(2).Holder() == true && wheels.get(0).Holder() == false) {
                rF0 = wheels.get(0).getRandomFruit();
            }
            if (wheels.get(0).Holder() == true && wheels.get(1).Holder() == false && wheels.get(2).Holder() == false) {
                rF1 = wheels.get(1).getRandomFruit();
                rF2 = wheels.get(2).getRandomFruit();
            }
            if (wheels.get(1).Holder() == true && wheels.get(0).Holder() == false && wheels.get(2).Holder() == false) {
                rF0 = wheels.get(0).getRandomFruit();
                rF2 = wheels.get(2).getRandomFruit();
            }
            if (wheels.get(2).Holder() == true && wheels.get(0).Holder() == false && wheels.get(1).Holder() == false) {
                rF0 = wheels.get(0).getRandomFruit();
                rF1 = wheels.get(1).getRandomFruit();
            }
            if (wheels.get(0).Holder() == false && wheels.get(1).Holder() == false && wheels.get(2).Holder() == false) {
                rF0 = wheels.get(0).getRandomFruit();
                rF1 = wheels.get(1).getRandomFruit();
                rF2 = wheels.get(2).getRandomFruit();
            }
            if (wheels.get(0).Holder() == true && wheels.get(1).Holder() == true && wheels.get(2).Holder() == true) {
                    System.out.println(" WHY DID YOUO BLOCK ALL THE WHEELS???");
                    System.out.println(rF0.getName());
                    System.out.println(rF1.getName());
                    System.out.println(rF2.getName());
                    return calculateWinning(rF0, rF1, rF2);
            }

                System.out.println(" calculateWinning 1 in if spintCounter == 1");
                System.out.println(rF0.getName());
                System.out.println(rF1.getName());
                System.out.println(rF2.getName());
                return calculateWinning(rF0, rF1, rF2);
            }
            System.out.println(" calculateWinning 3 EXIT");
            System.out.println(rF0.getName());
            System.out.println(rF1.getName());
            System.out.println(rF2.getName());
            return calculateWinning(rF0, rF1, rF2);
        }



    public int calculateWinning(Fruit rF0, Fruit rF1, Fruit rF2) {
        if (rF0 == rF1 && rF1 == rF2) {
            System.out.println("You Won");
            return (rF0.getValue() * 3);
        } else {
            System.out.println("You lose");
            return 0;
        }
    }


    public String play() {
        if (this.player.getCredit() > 0) {
            this.player.changeCredit(-1);
        } else {
            return "GAME OVER";
        }
        int winnings = spin();
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




