package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {

    @Test
    public void makeNoiseTest() {
        // Given
        Chicken chicken = new Chicken();

        // When
        String expected = "bwuak";
        String actual = chicken.makeNoise();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
