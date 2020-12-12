package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {

    CropDuster cropDuster;

    @Before
    public void init() {
        cropDuster = new CropDuster();
    }

    @Test
    public void operateTest() {
        Crop cornStalk = new CornStalk();
        CropRow cropRow = new CropRow(cornStalk);
        Field field = new Field(cropRow);
        Farm farm = new Farm();
        farm.addFields(field);

        cropDuster.operate(farm);
        Assert.assertTrue(cornStalk.getHasBeenFertilized());
    }

    @Test
    public void flyTest() {
        Crop cornStalk = new CornStalk();
        CropRow cropRow = new CropRow(cornStalk);
        Field field = new Field(cropRow);

        cropDuster.fly(field);
        Assert.assertTrue(cornStalk.getHasBeenFertilized());
    }

    @Test
    public void makeNoiseTest() {
        Assert.assertEquals("Swish", cropDuster.makeNoise());
    }

}
