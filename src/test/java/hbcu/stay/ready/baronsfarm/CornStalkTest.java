package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CornStalkTest {

    CornStalk cornStalk;

    @Before
    public void init() {
        cornStalk = new CornStalk();
    }

    @Test
    public void hasBeenHarvestedTest() {
        cornStalk.harvest();
        Assert.assertTrue(cornStalk.getHasBeenHarvested());
    }

    @Test
    public void hasBeenFertilizedTest() {
        cornStalk.fertilize();
        Assert.assertTrue(cornStalk.getHasBeenFertilized());
    }

    @Test
    public void yieldTest() {
        cornStalk.harvest();
        cornStalk.fertilize();
        EarCorn earCorn = cornStalk.yield();
        Assert.assertNotNull(earCorn);
    }
}
