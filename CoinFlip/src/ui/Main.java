package ui;

import model.Coin;

public class Main {

    private Coin coin;

    public static void main(String[] args) {
        System.out.println("Welcome to Coin Flip");
        Main program = new Main();
    }

    public Main() {
        coin = new Coin();
        int i;
        for (i = 0; i < 10; i++) {
            printCoinState(coin);
            handleFlip(coin);
        }
    }

    private void handleFlip(Coin coin) {
        System.out.println("Flipping the coin...");
        coin.flip();
    }

    private void printCoinState(Coin coin) {
        boolean state = coin.getCoinState();
        if (state) {
            System.out.println("Coin is now Heads");
        } else {
            System.out.println("Coin is Tails");
        }
    }

}
