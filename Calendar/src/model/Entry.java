package model;

public abstract class Entry {
    private MyDate date;
    private MyTime time;
    private String label;
    private boolean isEntryRepeating;
    private int intervalOfRepetition;

    public Entry(MyDate date, MyTime time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
        isEntryRepeating = false;
        intervalOfRepetition = 0;
    }

    public MyDate getDate() {
        return date;
    }

    public MyTime getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public boolean isRepeating() {
        return isEntryRepeating;
    }

    public int getIntervalOfRepetition() {
        return intervalOfRepetition;
    }

    public void setIntervalOfRepetition(int nextInterval) {
        intervalOfRepetition = nextInterval;
    }
}
