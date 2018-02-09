package example.codeclan.com.javafruitmachine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 31/01/2018.
 */

public class GameTest {

    Wheel wheel;
    Game game;
    ArrayList<Wheel> wheels;
    Player player;

    @Before
    public void before() {
        Player player = new Player("Giuseppe", 50);
        ArrayList<Fruit> fruitTest = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        Fruit tomato = new Fruit("Tomato", 30);
        Fruit cherry = new Fruit("Cherry", 40);
        Fruit lemon = new Fruit("Lemon", 50);
        Fruit kiwi = new Fruit("Kiwi", 60);
        Fruit avocado = new Fruit("Avocado", 70);
        Fruit orange = new Fruit("Orange", 80);
        Fruit peach = new Fruit("Peach", 90);
        Fruit watermelon = new Fruit("Watermelon", 100);
        fruitTest.add(apple);
        fruitTest.add(banana);
        fruitTest.add(tomato);
        fruitTest.add(cherry);
        fruitTest.add(lemon);
        fruitTest.add(kiwi);
        fruitTest.add(avocado);
        fruitTest.add(orange);
        fruitTest.add(peach);
        fruitTest.add(watermelon);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest);
        Wheel center = new Wheel("Center", fruitTest);
        Wheel right = new Wheel("Right", fruitTest);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Giuseppe", game.getPlayerName());
    }


    @Test
    public void canGetPlayerCredit() {
        assertEquals(50, game.getPlayerCredit());
    }

    @Test
    public void canCountWheels() {
        assertEquals(3, game.wheels.size());
    }

    @Test
    public void canGetPositionOfAWheelInsideWheels() {
        assertEquals("Left", game.wheels.get(0).getPosition());
    }

    @Test
    public void canWinSpin() {
        Player player = new Player("Giuseppe", 50);
        ArrayList<Fruit> fruitTest = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        fruitTest.add(apple);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest);
        Wheel center = new Wheel("Center", fruitTest);
        Wheel right = new Wheel("Right", fruitTest);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        assertEquals(30, game.spin());
    }


    @Test
    public void canLoseSpin() {
        Player player = new Player("Giuseppe", 50);
        ArrayList<Fruit> fruitTest1 = new ArrayList<>();
        ArrayList<Fruit> fruitTest2 = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        fruitTest1.add(apple);
        fruitTest2.add(banana);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest1);
        Wheel center = new Wheel("Center", fruitTest1);
        Wheel right = new Wheel("Right", fruitTest2);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        assertEquals(0, game.spin());
    }

    @Test
    public void playerCanStartGame() {
        Player player = new Player("Giuseppe", 50);
        ArrayList<Fruit> fruitTest = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        fruitTest.add(apple);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest);
        Wheel center = new Wheel("Center", fruitTest);
        Wheel right = new Wheel("Right", fruitTest);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        assertEquals(50, game.getPlayerCredit());
        assertEquals("You win 30 credits", game.play());
        assertEquals(79, game.getPlayerCredit());
    }

    @Test
    public void playerCannotStartGame() {
        Player player = new Player("Giuseppe", 0);
        ArrayList<Fruit> fruitTest = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        fruitTest.add(apple);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest);
        Wheel center = new Wheel("Center", fruitTest);
        Wheel right = new Wheel("Right", fruitTest);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        assertEquals(0, game.getPlayerCredit());
        assertEquals("GAME OVER", game.play());
        assertEquals(0, game.getPlayerCredit());
    }



    @Test
    public void canLosePlay() {
        Player player = new Player("Giuseppe", 50);
        ArrayList<Fruit> fruitTest1 = new ArrayList<>();
        ArrayList<Fruit> fruitTest2 = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        fruitTest1.add(apple);
        fruitTest2.add(banana);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest1);
        Wheel center = new Wheel("Center", fruitTest1);
        Wheel right = new Wheel("Right", fruitTest2);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        assertEquals("", game.play());
        assertEquals(49, player.getCredit());
    }

    @Test
    public void canConsumeCredits() {
        player = new Player("Giuseppe", 5);
        ArrayList<Fruit> fruitTest1 = new ArrayList<>();
        ArrayList<Fruit> fruitTest2 = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        fruitTest1.add(apple);
        fruitTest2.add(banana);
        wheels = new ArrayList<>();
        Wheel left = new Wheel("Left", fruitTest1);
        Wheel center = new Wheel("Center", fruitTest1);
        Wheel right = new Wheel("Right", fruitTest2);
        wheels.add(left);
        wheels.add(center);
        wheels.add(right);
        game = new Game(player, wheels);
        game.play();
        game.play();
        game.play();
        game.play();
        assertEquals(1, player.getCredit());
    }



}


