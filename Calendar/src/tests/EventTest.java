package tests;

import model.Event;
import model.MyDate;
import model.MyTime;
import model.Reminder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class EventTest {
    private Event e;
    private Reminder r;
    private MyDate febDate;
    private MyTime t;

    @Before
    public void setup() {
        febDate = new MyDate("February", 1, 1990);
        t = new MyTime(18, 45);
        e = new Event(febDate, t, "Peter's Birthday");
    }

    @Test
    public void setReminderTest() {
        MyTime reminderTime = new MyTime(9, 20);
        String reminderLabel = "Birth occurs in roughly 9 hours";
        r = new Reminder(febDate, reminderTime, reminderLabel);
        e.setReminder(r);
        assertTrue(r.getLabel().equals(reminderLabel));
    }
}
