package tests;

import model.Meeting;
import model.MyDate;
import model.MyTime;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MeetingTest {
    private Meeting m;

    @Before
    public void setup() {
        MyDate d = new MyDate("February", 1, 1990);
        MyTime t = new MyTime(18, 45);
        m = new Meeting(d, t, "Board Meeting");
    }

    @Test
    public void constructorTest() {
        assertTrue(m.getDate().getMonth().equals("February"));
        assertTrue(m.getLabel().equals("Board Meeting"));
    }

    public boolean hasEmailInList(int idx, String email) {
        return m.getEmails().get(idx).equals(email);
    }

    @Test
    public void addParticipantTest() {
        m.addParticipant("peter@cloakhire.com");
        m.addParticipant("jon@gmail.com");
        assertTrue(hasEmailInList(0, "peter@cloakhire.com"));
        assertTrue(hasEmailInList(1, "jon@gmail.com"));
    }

    @Test
    public void removeOneParticipantTest() {
        m.addParticipant("peter@cloakhire.com");
        m.addParticipant("jon@gmail.com");
        m.addParticipant("clownmaster@cloakhire.com");
        m.removeOneParticipant("jon@gmail.com");
        assertTrue(m.getEmails().size() == 2);
        assertTrue(m.getEmails().get(1).equals("clownmaster@cloakhire.com"));
    }
}
