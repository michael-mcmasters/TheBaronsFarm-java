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
        Assert.assertTrue("Number of stables", farm.getStables().size() == 1);
        Assert.assertTrue("Number of chicken coops", farm.getStables().size() == 1);
        Assert.assertTrue("Number of fields", farm.getStables().size() == 1);
    }

    @Test
    public void addStablesTest() {
        Farm farm = new Farm();
        farm.addStables(new Stable());
        farm.addStables(new Stable());
        ArrayList<Stable> stables = farm.getStables();

        Assert.assertTrue(stables.size() == 2);
    }

    @Test
    public void addChickenCoopTest() {
        Farm farm = new Farm();
        farm.addChickenCoops(new ChickenCoop());
        farm.addChickenCoops(new ChickenCoop());
        ArrayList<ChickenCoop> chickenCoops = farm.getChickenCoops();

        Assert.assertTrue(chickenCoops.size() == 2);
    }

    @Test
    public void addFieldTest() {
        Farm farm = new Farm();
        farm.addFields(new Field());
        farm.addFields(new Field());
        ArrayList<Field> fields = farm.getFields();

        Assert.assertTrue(fields.size() == 2);
    }

    @Test
    public void setFarmHouse() {
        FarmHouse farmHouse = new FarmHouse();
        farm.setFarmHouse(farmHouse);
        Assert.assertEquals(farmHouse, farm.getFarmHouse());
    }
}
















