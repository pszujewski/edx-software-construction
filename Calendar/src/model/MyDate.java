package model;

import java.util.ArrayList;
import java.util.List;

public class MyDate {
    private String month;
    private int day;
    private int year;
    private List<String> allMonths;

    public MyDate(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
        allMonths = new ArrayList<String>();
        setUpMonths();
    }

    private void addOneMonth(String m) {
        allMonths.add(m);
    }

    private void setUpMonths() {
        for (Months m : Months.values()) addOneMonth(m.toString());
    }

    public List<String> getAllMonths() {
        return allMonths;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getFullDate() {
        return month + ", " + day + ", " + year ;
    }

    private int getMonthIndex(String m) {
        for (int i = 0; i < 12; i++) {
            if (allMonths.get(i).equals(m)) {
                return i + 1;
            }
        }
        return -1;
    }

    private String prependZeroStringifyInt(int i) {
        if (i < 10) {
            return "0".concat(Integer.toString(i));
        }
        return Integer.toString(i);
    }

    public String getShortDate() {
        String monthByNum = prependZeroStringifyInt(getMonthIndex(month));
        String dayFormat = prependZeroStringifyInt(getDay());
        return monthByNum + "-" + dayFormat + "-" + Integer.toString(year);
    }
}
