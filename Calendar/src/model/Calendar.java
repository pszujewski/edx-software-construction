package model;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private MyDate currentDate;
    private String userEmail;
    private List<Event> events;
    private List<Meeting> meetings;

    public Calendar(String userEmail, MyDate currentDate) {
        this.userEmail = userEmail;
        this.currentDate = currentDate;
        events = new ArrayList<Event>();
        meetings = new ArrayList<Meeting>();
    }

    public void addOneMeeting(Meeting mtg) {
        meetings.add(mtg);
    }

    public void addOneEvent(Event evt) {
        events.add(evt);
    }

    // setters
    // MODIFIES: this
    // EFFECTS: Updates the state of the current date for calendar
    public void updateCurrentDate(MyDate d) {
        currentDate = d;
    }

    // getters
    public Event getEntryByLabel(String label) {
        for (Event mtg : meetings) {
            if (mtg.getLabel().equals(label)) {
                return mtg;
            }
        }
        for (Event evt : events) {
            if (evt.getLabel().equals(label)) {
                return evt;
            }
        }
        throw new Error("entry searched for does not exist");
    }

    public List<Meeting> getMeetings() {
        return meetings;
    }
    public List<Event> getEvents() {
        return events;
    }
    public MyDate getCurrentDate() {
        return currentDate;
    }
    public String getUserEmail() {
        return userEmail;
    }
}
