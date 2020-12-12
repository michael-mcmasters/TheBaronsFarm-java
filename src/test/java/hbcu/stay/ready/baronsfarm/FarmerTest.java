package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer;

    @Before
    public void init() {
        Farm farm = new Farm();
        farmer = new Farmer(farm);
    }

    @Test
    public void mountRideableTest() {
        farmer.mountRideable(new Horse());
    }

    @Test
    public void dismountRideabltTest() {
        farmer.dismountRideable(new CropDuster());
    }

    @Test
    // When you plant a crop, it is just added to a list in the crop row. This test makes sure it is in list.
    public void plantTest() {
        Crop tomatoPlant = new TomatoPlant();
        CropRow cropRow = new CropRow();
        farmer.plant(tomatoPlant, cropRow);
        Assert.assertSame(cropRow.getCrops().get(0), tomatoPlant);
    }
}
