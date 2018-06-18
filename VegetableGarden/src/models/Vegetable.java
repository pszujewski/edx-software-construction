package models;

public abstract class Vegetable implements Growable {
    public String name;
    public VegType type;
    public String instructions;

    public Vegetable(String name, VegType type) {
        this.name = name;
        this.type = type;
        this.instructions = "Plant Vegetable. Water every other day and ensure access to enough sunlight.";
    }

    protected void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    // getters
    @Override
    public String getInstructions() { return instructions; }
    public String getName() { return name; }
    public VegType getType() { return type; }
}
