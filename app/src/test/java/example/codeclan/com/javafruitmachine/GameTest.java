package example.codeclan.com.javafruitmachine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
}
