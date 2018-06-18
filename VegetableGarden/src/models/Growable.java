package models;

public interface Growable {
    // EFFECTS: Prints instructions for how to 'feed'
    void feed();

    // EFFECTS: Prints watering steps
    void water();

    // EFFECTS: Prints instructions
    String getInstructions();

    // EFFECTS: Prints harvesting steps
    void harvest();
}
