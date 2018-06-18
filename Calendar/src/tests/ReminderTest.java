package tests;

import model.MyDate;
import model.MyTime;
import model.Reminder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ReminderTest {
    private Reminder r;
    private MyDate d;
    private MyTime t;

    @Before
    public void setup() {
        d = new MyDate("February", 1, 1990);
        t = new MyTime(18, 45);
        r = new Reminder(d, t, "Board Meeting Reminder");
    }

    @Test
    public void testSetNotes() {
        String note = "Board meeting will perhaps start late";
        r.setNote(note);
        assertTrue(r.getNote().equals(note));
    }

    @Test
    public void constructorTest() {
        assertTrue(r.getDate().getMonth().equals("February"));
        assertTrue(r.getTime().getMinutes() == 45);
    }

    @Test
    public void setIntervalTest() {
        // set interval of rep to every 7 days
        r.setIntervalOfRepetition(7);
        assertTrue(r.getIntervalOfRepetition() == 7);
    }
}
