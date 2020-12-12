package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void constructorTestA() {
        CropRow cropRow = new CropRow();
        Assert.assertTrue(cropRow.getCrops().size() == 0);
    }

    @Test
    public void constructorTestB() {
        CropRow cropRow = new CropRow(new CornStalk(), new TomatoPlant());
        Assert.assertTrue(cropRow.getCrops().size() == 2);
    }

    @Test
    public void plantCropTest() {
        CropRow cropRow = new CropRow();
        cropRow.plantCrop(new CornStalk());
        cropRow.plantCrop(new TomatoPlant());
        cropRow.plantCrop(new TomatoPlant());
        Assert.assertTrue(cropRow.getCrops().size() == 3);
    }
}
