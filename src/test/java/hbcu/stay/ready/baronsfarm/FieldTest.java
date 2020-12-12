package hbcu.stay.ready.baronsfarm;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void constructorTestA() {
        Field field = new Field();
        Assert.assertTrue(field.getCropRows().size() == 0);
    }

    @Test
    public void constructorTestB() {
        CropRow cropRow = new CropRow();
        Field field = new Field(cropRow);
        Assert.assertTrue(field.getCropRows().size() == 1);
    }

    @Test
    public void constructorTestC() {
        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        Field field = new Field(cropRow1, cropRow2);
        Assert.assertTrue(field.getCropRows().size() == 2);
    }

    @Test
    public void constructorTestD() {
        CropRow[] cropRows = { new CropRow(), new CropRow(), new CropRow() };
        Field field = new Field(cropRows);
        Assert.assertTrue(field.getCropRows().size() == 3);
    }

    @Test
    public void addCropRowsTest() {
        Field field = new Field();
        field.addCropRows(new CropRow(), new CropRow(), new CropRow());
        field.addCropRows(new CropRow());
        Assert.assertTrue(field.getCropRows().size() == 4);
    }
}
