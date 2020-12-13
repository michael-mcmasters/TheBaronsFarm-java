package hbcu.stay.ready.baronsfarm.singletons;

import org.junit.Assert;
import org.junit.Test;

public class BaronessTest {

    @Test
    public void instanceTest() {
        Assert.assertTrue(Baroness.getInstance() != null);
    }

}
