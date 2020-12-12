package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void constructorTest() {
        Stable stable = new Stable(new Horse(), new Horse());
        Assert.assertEquals(2, stable.getHorseList().size());
    }

    @Test
    public void addHorsesTest() {
        Stable stable = new Stable();
        stable.addHorses(new Horse());
        Assert.assertEquals(1, stable.getHorseList().size());
    }
}
