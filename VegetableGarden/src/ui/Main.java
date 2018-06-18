package ui;

import models.Vegetable;
import models.Veggies.Carrot;
import models.Veggies.Lettuce;
import models.Veggies.Tomato;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        List<Vegetable> garden = new ArrayList<>();
        garden.add(new Tomato());
        garden.add(new Carrot());
        garden.add(new Lettuce());

        for (Vegetable v : garden) {
            System.out.println(m.getDisplayVegType(v));
            System.out.println("Instructions for " + v.getName() + ": " + v.getInstructions());
        }

        for (Vegetable v : garden) {
            System.out.println("Calling interface methods for " + v.getName());
            v.feed();
            v.water();
            v.harvest();
        }
    }

    public String getDisplayVegType(Vegetable v) {
        String name = v.getName();
        switch (v.getType()) {
            case ROOT:
                return name + " is a root vegetable";
            case LEAF:
                return name + " is a leaf vegetable";
            case SEED:
                return name + " is a seed vegetable";
        }
        throw new Error("The vegetable type is missing!");
    }
}
