package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

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
        farm.addToFieldList(field);

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
