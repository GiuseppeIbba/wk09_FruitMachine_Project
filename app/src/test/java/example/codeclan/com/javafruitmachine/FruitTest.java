package example.codeclan.com.javafruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 31/01/2018.
 */

public class FruitTest {

    Fruit fruit;

    @Before
    public void before() {
        fruit = new Fruit("Apple", 10);
    }

    @Test
    public void canHaveName() {
        assertEquals("Apple", fruit.getName());
    }

    @Test
    public void canHaveValue() {
        assertEquals(10, fruit.getValue());
    }
}

