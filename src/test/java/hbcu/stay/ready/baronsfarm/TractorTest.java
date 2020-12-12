package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TractorTest {

    Tractor tractor;

    @Before
    public void init() {
        tractor = new Tractor();
    }

    @Test
    public void operateTest() {
        Crop cornStalk = new CornStalk();
        CropRow cropRow = new CropRow(cornStalk);
        Field field = new Field(cropRow);
        Farm farm = new Farm();
        farm.addFields(field);

        tractor.operate(farm);
        Assert.assertTrue(cornStalk.getHasBeenHarvested());
    }

    @Test
    public void makeNoiseTest() {
        Assert.assertEquals("bruhbruhbruhburh", tractor.makeNoise());
    }
}
