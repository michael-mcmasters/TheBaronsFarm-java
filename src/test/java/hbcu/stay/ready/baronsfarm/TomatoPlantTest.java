package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant tomatoPlant;

    @Before
    public void init() {
        tomatoPlant = new TomatoPlant();
    }

    @Test
    public void hasBeenHarvestedTest() {
        tomatoPlant.harvest();
        Assert.assertTrue(tomatoPlant.getHasBeenHarvested());
    }

    @Test
    public void hasBeenFertilizedTest() {
        tomatoPlant.fertilize();
        Assert.assertTrue(tomatoPlant.getHasBeenFertilized());
    }

    @Test
    public void yieldTest() {
        tomatoPlant.harvest();
        tomatoPlant.fertilize();
        Tomato earCorn = tomatoPlant.yield();
        Assert.assertNotNull(earCorn);
    }
}
