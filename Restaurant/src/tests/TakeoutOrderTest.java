package tests;

import model.TakeoutOrder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TakeoutOrderTest {
    private TakeoutOrder completeOrder;
    private TakeoutOrder orderInProgress;

    @Before
    public void setup() {
        completeOrder = new TakeoutOrder(1, "John Doe");
        completeOrder.setOrderParams("complete", 'A', "No sauce");
        orderInProgress = new TakeoutOrder(2, "Jane Dow");
        orderInProgress.setOrderParams("in progress", 'B', "None");
    }

    @Test
    public void testIsOrderComplete() {
        assertTrue(completeOrder.isOrderComplete());
        assertFalse(orderInProgress.isOrderComplete());
    }

    @Test
    public void testGetPriceByCombo() {
        assertEquals(completeOrder.getPriceByCombo(), 2.50);
        assertEquals(orderInProgress.getPriceByCombo(), 3.00);
    }
}
