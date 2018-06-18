package model;

import java.util.ArrayList;
import java.util.List;

public class Meeting extends Event {
    private List<String> emails;

    public Meeting(MyDate d, MyTime t, String label) {
        super(d, t, label);
        emails = new ArrayList<String>();
    }

    // MODIFIES: this
    // EFFECTS: Adds the email of one participant to the list
    //          of participants
    public void addParticipant(String email) {
        emails.add(email);
    }

    // MODIFIES: this
    // EFFECTS: Removes one email address from the participants list
    public void removeOneParticipant(String email) {
        if (emails.contains(email)) {
            emails.remove(email);
        }
    }

    // EFFECTS: Prints invitation messages
    public void sendInvitations() {
        for (String e : emails) {
            System.out.println("Sending invitation to " + e);
        }
    }

    // getters
    public List<String> getEmails() {
        return emails;
    }
}
