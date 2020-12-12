package hbcu.stay.ready.baronsfarm.singletons;

import org.junit.Assert;
import org.junit.Test;

public class BaronTest {

    @Test
    public void instanceTest() {
        Assert.assertTrue(Baron.getInstance() != null);
    }
}
