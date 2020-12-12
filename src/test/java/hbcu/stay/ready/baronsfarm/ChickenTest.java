package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    private Chicken chicken;

    @Before
    public void init() {
        chicken = new Chicken();
    }

    @Test
    public void makeNoiseTest() {
        String actual = chicken.makeNoise();
        Assert.assertEquals("bwuak", actual);
    }

    @Test
    public void harvestTest() {
        chicken.harvest();
        Assert.assertTrue(chicken.getHasBeenHarvested());
    }

    @Test
    public void fertilizeTest() {
        chicken.fertilize();
        Assert.assertTrue(chicken.getHasBeenFertilized());
    }

    @Test
    public void yield() {
        chicken.harvest();
        chicken.fertilize();
        EdibleEgg edible = chicken.yield();
        Assert.assertNotNull(edible);
    }
}
