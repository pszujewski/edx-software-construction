package tests;

import model.MyTime;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MyTimeTest {
    private MyTime mt1;
    private MyTime mt2;

    @Before
    public void setup() {
        mt1 = new MyTime(2, 3);
        mt2 = new MyTime(18, 45);
    }

    @Test
    public void constructorTest() {
        assertTrue(mt1.getHours() == 2);
        assertTrue(mt2.getHours() == 18);
        assertTrue(mt1.getMinutes() == 3);
        assertTrue(mt2.getMinutes() == 45);
    }

    @Test
    public void getTimeFormattedTest() {
        assertTrue(mt1.getTimeFormatted().equals("02h03"));
        assertTrue(mt2.getTimeFormatted().equals("18h45"));
    }
}
