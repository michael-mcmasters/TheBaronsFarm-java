package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenCoopTest {

    private ChickenCoop chickenCoop;

    @Before
    public void init() {
        this.chickenCoop = new ChickenCoop(3);
    }

    @Test
    public void addChickenTest() {
        chickenCoop.addChicken(2);
        int actualNumOfChickens = chickenCoop.getChickenList().size();
        Assert.assertEquals(5, actualNumOfChickens);
    }
}
