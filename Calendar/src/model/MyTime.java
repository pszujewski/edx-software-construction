package model;

public class MyTime {
    private int hours;
    private int minutes;

    public MyTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private String getTimeAsStr(int t) {
        String param = Integer.toString(t);
        if (param.length() > 1) {
            return param;
        }
        return "0".concat(param);
    }

    public String getTimeFormatted() {
        return getTimeAsStr(hours) + "h" + getTimeAsStr(minutes);
    }
}
