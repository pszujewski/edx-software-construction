package models.Veggies;

import models.VegType;
import models.Vegetable;

public class Carrot extends Vegetable {
    public Carrot() {
        super("Carrot", VegType.ROOT);
        setInstructions("Plant carrot seeds in firm dirt and let it grow! Plant next to tomatoes");
    }

    // EFFECTS: Prints instructions for how to 'feed'
    @Override
    public void feed() {
        System.out.println("Fertilize the carrot one time");
    }

    // EFFECTS: Prints watering steps
    @Override
    public void water() {
        System.out.println("Water every few days, does not need to much water");
    }

    // EFFECTS: Prints harvesting steps
    @Override
    public void harvest() {
        System.out.println("When the leaves reach most of the way up your calf, time to harvest. Pull from ground.");
    }
}
