package model;

public class Coin {

    private boolean isHeads;

    public Coin() {
        isHeads = true;
    }

    // MODIFIES: this
    // EFFECTS: Toggles state of coin
    public void flip() {
        this.isHeads = !this.isHeads;
    }

    public boolean getCoinState() {
        return isHeads;
    }

}
