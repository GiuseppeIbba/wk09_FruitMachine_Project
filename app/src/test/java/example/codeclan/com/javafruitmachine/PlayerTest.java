package example.codeclan.com.javafruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 31/01/2018.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Giuseppe", 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Giuseppe", player.getName());
    }

    @Test
    public void canGetCredit() {
        assertEquals(50, player.getCredit());
    }

}
