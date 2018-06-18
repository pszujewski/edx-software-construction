package tests;

import models.VegType;
import models.Veggies.Carrot;
import models.Veggies.Lettuce;
import models.Veggies.Tomato;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class VegetableTest {
    private Carrot c;
    private Tomato t;
    private Lettuce l;

    @Before
    public void setup() {
        c = new Carrot();
        t = new Tomato();
        l = new Lettuce();
    }

    @Test
    public void getNametest() {
        assertTrue(c.getName().equals("Carrot"));
        assertTrue(t.getName().equals("Tomato"));
        assertTrue(l.getName().equals("Lettuce"));
    }

    @Test
    public void getTypeTest() {
        assertTrue(c.getType().equals(VegType.ROOT));
        assertTrue(t.getType().equals(VegType.SEED));
        assertTrue(l.getType().equals(VegType.LEAF));
    }

    @Test
    public void getInstructionsTest() {
        String expected = "Plant carrot seeds in firm dirt and let it grow! Plant next to tomatoes";
        assertTrue(c.getInstructions().equals(expected));
    }
}
