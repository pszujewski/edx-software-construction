package model;

public class Event extends Entry {
    private Reminder reminder;

    public Event(MyDate date, MyTime time, String label) {
        super(date, time, label);
    }

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }
}
