package tests;

import model.MyDate;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MyDateTest {
    private MyDate febDate;
    private MyDate aprilDate;
    private MyDate novDate;

    @Before
    public void setup() {
        febDate = new MyDate("February", 1, 1990);
        aprilDate = new MyDate("April", 10, 2010);
        novDate = new MyDate("November", 19, 2002);
    }

    private void hasCorrectMonthsList(MyDate md) {
        assertEquals(md.getAllMonths().size(), 12);
    }

    @Test
    public void constructorTest() {
        hasCorrectMonthsList(febDate);
        hasCorrectMonthsList(aprilDate);
        hasCorrectMonthsList(novDate);
        assertTrue(febDate.getDay() == 1);
        assertTrue(novDate.getDay() == 19);
        assertTrue(aprilDate.getYear() == 2010);
        assertTrue(aprilDate.getMonth().equals("April"));
    }

    @Test
    public void getFullDateTest() {
        assertTrue(febDate.getFullDate().equals("February, 1, 1990"));
        assertTrue(aprilDate.getFullDate().equals("April, 10, 2010"));
        assertTrue(novDate.getFullDate().equals("November, 19, 2002"));
    }

    @Test
    public void getShortDateTest() {
        assertTrue(febDate.getShortDate().equals("02-01-1990"));
        assertTrue(aprilDate.getShortDate().equals("04-10-2010"));
        assertTrue(novDate.getShortDate().equals("11-19-2002"));
    }
}
