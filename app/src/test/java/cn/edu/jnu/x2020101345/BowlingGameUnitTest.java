package cn.edu.jnu.x2020101345;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test_20zeros()
    {
        repeatedRoll(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void test_20Ones()
    {

        repeatedRoll(1,20);
        assertEquals(20,game.score());
    }

   @Test
    public void test_ASpare()
    {

        rollASpare();
        game.roll(6);
        repeatedRoll(0,17);
        assertEquals(22,game.score());
    }

    @Test
    public void test_AStrike()
    {

        game.roll(10)
        game.roll(6);
        game.roll(2);
        repeatedRoll(2,16);
        assertEquals(58,game.score());
    }

    private void rollASpare() {
        game.roll(6);
        game.roll(4);
    }


    private void repeatedRoll(int pin, int times) {
        for (int i=0;i<times;i++)
        {
            game.roll(pin);
        }
    }


}