package example.codeclan.com.javafruitmachine;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 31/01/2018.
 */

public class WheelTest {

    Wheel wheel;
    ArrayList<Fruit> fruits;

    @Before
    public void before() {
        fruits = new ArrayList<>();
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
        fruits.add(apple);
        fruits.add(banana);
        fruits.add(tomato);
        fruits.add(cherry);
        fruits.add(lemon);
        fruits.add(kiwi);
        fruits.add(avocado);
        fruits.add(orange);
        fruits.add(peach);
        fruits.add(watermelon);
        wheel = new Wheel("Left", fruits);

    }

    @Test
    public void canHavePosition() {
        assertEquals("Left", wheel.getPosition());
    }

    @Test
    public void canGetFruitName() {
        assertThat(wheel.getFruit(), instanceOf(Fruit.class));
        assertEquals("Apple", wheel.getFruit().getName());
    }

    @Test
    public void canGetFruitValue() {
        assertThat(wheel.getFruit(), instanceOf(Fruit.class));
        assertEquals(10, wheel.getFruit().getValue());
    }

    @Test
    public void canCountItemInWheel() {
        assertEquals(10, wheel.getCount());
    }

    @Test
    public void canGetRandomFruit() {
        fruits = new ArrayList<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit banana = new Fruit("Banana", 20);
        Fruit tomato = new Fruit("Tomato", 30);
        fruits.add(apple);
        fruits.add(banana);
        fruits.add(tomato);
        wheel = new Wheel("Left", fruits);
        assert wheel.getRandomFruit().equals(tomato) || wheel.getRandomFruit().equals(banana) || wheel.getRandomFruit().equals(apple);
    }
}
