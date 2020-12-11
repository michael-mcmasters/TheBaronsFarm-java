package hbcu.stay.ready.baronsfarm;

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
        // ToDo
    }

    @Test
    public void fertilizeTest() {
        // ToDo
    }
}
