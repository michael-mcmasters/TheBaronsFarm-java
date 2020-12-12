package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Person;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void getPersonListTest() {
        FarmHouse farmHouse = new FarmHouse(new Pilot());
        Assert.assertTrue(farmHouse.getPersonList().size() == 1);
    }
}
