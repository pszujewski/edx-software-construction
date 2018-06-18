package models.Veggies;

import models.VegType;
import models.Vegetable;

public class Lettuce extends Vegetable {
    public Lettuce() {
        super("Lettuce", VegType.LEAF);
        setInstructions("Buy starter from Home Depot. Plant with access to plenty of sun and water");
    }

    // EFFECTS: Prints instructions for how to 'feed'
    @Override
    public void feed() {
        System.out.println("Keep watered regularly");
    }

    // EFFECTS: Prints watering steps
    @Override
    public void water() {
        System.out.println("Water at base of lettuce.");
    }

    // EFFECTS: Prints harvesting steps
    @Override
    public void harvest() {
        System.out.println("Trim leaves carefully because it can grow back");
    }
}
