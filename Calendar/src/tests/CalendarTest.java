package tests;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class CalendarTest {
    private Calendar c;

    @Before
    public void setup() {
        MyDate d = new MyDate("February", 1, 1990);
        c = new Calendar("peter@cloakhire.com", d);
    }

    @Test
    public void updateCurrentDateTest() {
        MyDate nextDate = new MyDate("March", 22, 1992);
        String originalMonth = c.getCurrentDate().getMonth();
        c.updateCurrentDate(nextDate);
        assertTrue(originalMonth.equals("February"));
        assertTrue(c.getCurrentDate().getMonth().equals("March"));
    }

    private Meeting getMeeting(String label, int day) {
        MyDate mtgDate = new MyDate("April", day, 2018);
        MyTime mtgTime = new MyTime(10, 15);
        return new Meeting(mtgDate, mtgTime, label);
    }

    private Meeting addTwoMeetingsToCalendar() {
        Meeting boardMeeting = getMeeting("Board Meeting", 4);
        Meeting groupMeeting = getMeeting("Group Meeting", 7);
        c.addOneMeeting(boardMeeting);
        c.addOneMeeting(groupMeeting);
        return groupMeeting;
    }

    @Test
    public void addOneMeetingTest() {
        Meeting groupMeeting = addTwoMeetingsToCalendar();
        assertTrue(c.getMeetings().size() == 2);
        assertTrue(c.getMeetings().get(1).equals(groupMeeting));
    }

    @Test
    public void getEntryByLabelTest() {
        Meeting groupMeeting = addTwoMeetingsToCalendar();
        Event foundEvent = c.getEntryByLabel(groupMeeting.getLabel());
        assertTrue(foundEvent.equals(groupMeeting));
    }

    @Test
    public void addOneEventTest() {
        MyDate dt = new MyDate("June", 24, 2018);
        MyTime tm = new MyTime(1, 0);
        Event birthday = new Event(dt, tm, "Birthday");
        c.addOneEvent(birthday);
        assertTrue(c.getEvents().size() == 1);
        assertTrue(c.getEvents().get(0).equals(birthday));
    }
}
