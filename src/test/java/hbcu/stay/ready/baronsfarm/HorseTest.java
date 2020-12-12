package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class HorseTest {

    @Test
    public void makeNoiseTest() {
        Horse horse = new Horse();
        horse.makeNoise();
        Assert.assertEquals("Clickety click, heehaw heehaw, it's dominic the donkey. Or horse. Idk.", horse.makeNoise());
    }
}
