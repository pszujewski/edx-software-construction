package tests;

import org.junit.Before;
import org.junit.Test;

import model.Coin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CoinTest {
    private Coin testCoin;

    @Before
    public void setup() {
        testCoin = new Coin();
    }

    @Test
    public void testFlip() {
        assertTrue(testCoin.getCoinState());
        testCoin.flip();
        assertFalse(testCoin.getCoinState());
    }


}
