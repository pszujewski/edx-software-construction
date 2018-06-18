package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        MyDate d = new MyDate("February", 1, 2018);
        Calendar c = new Calendar("peter@cloakhire.com", d);

        MyDate dt = new MyDate("June", 24, 2018);
        MyTime tm = new MyTime(1, 0);
        Event birthday = new Event(dt, tm, "Birthday");

        MyDate mtgDate = new MyDate("April", 1, 2018);
        MyTime mtgTime = new MyTime(10, 15);
        Meeting boardMeeting = new Meeting(mtgDate, mtgTime, "Board Meeting");

        MyDate mtgDate1 = new MyDate("April", 4, 2018);
        MyTime mtgTime1 = new MyTime(6, 25);
        Meeting groupMeeting = new Meeting(mtgDate1, mtgTime1, "Working Group");

        System.out.println("The current day is " + c.getCurrentDate().getFullDate());
        System.out.println("Short Format: " + c.getCurrentDate().getShortDate());

        c.addOneEvent(birthday);
        c.addOneMeeting(boardMeeting);
        c.addOneMeeting(groupMeeting);
        System.out.println("You have scheduled " + c.getMeetings().size() + " meeting(s)");
        System.out.println("You have " + c.getEvents().size() + " event(s) scheduled");

        c.updateCurrentDate(dt);
        System.out.println("The current day is " + c.getCurrentDate().getFullDate());
        System.out.println("Short Format: " + c.getCurrentDate().getShortDate());
    }
}
