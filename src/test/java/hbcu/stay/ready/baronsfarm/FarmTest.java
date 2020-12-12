package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FarmTest {

    Farm farm;

    @Before
    public void init() {
        farm = new Farm();
    }

    @Test
    public void constructorTest() {
        ArrayList<Stable> stables = new ArrayList<>();
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        ArrayList<Field> fields = new ArrayList<>();
        FarmHouse farmHouse = new FarmHouse(new Farmer(new Farm()));

        stables.add(new Stable());
        chickenCoops.add(new ChickenCoop());
        fields.add(new Field());

        Farm farm = new Farm(stables, chickenCoops, fields, farmHouse);
        Assert.assertTrue("Number of stables", farm.getStableList().size() == 1);
        Assert.assertTrue("Number of chicken coops", farm.getStableList().size() == 1);
        Assert.assertTrue("Number of fields", farm.getStableList().size() == 1);
    }
}
















