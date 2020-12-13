package hbcu.stay.ready.baronsfarm.workweek;

import hbcu.stay.ready.baronsfarm.*;
import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.singletons.Baron;
import hbcu.stay.ready.baronsfarm.singletons.Baroness;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SundayTest {

    private final Baron baron = Baron.getInstance();
    private final Baroness baroness = Baroness.getInstance();

    @Test
    public void baronMountHorse() {
        List<Horse> horses = baron.getFarm().getAllHorses();

        String actual = "";
        for (Horse horse : horses) {
            actual = baron.mountRideable(horse);
        }
        Assert.assertEquals("Wooooo!", actual);
    }

    @Test
    public void baronessMountHorse() {
        List<Horse> horses = baron.getFarm().getAllHorses();

        String actual = "";
        for (Horse horse : horses) {
            actual = baroness.mountRideable(horse);
        }
        Assert.assertEquals("I'm so high up!", actual);
    }

    @Test
    public void bothFeedHorses() {
        // Get Ear Corn
        List<EarCorn> earCornList = new ArrayList<>();
        List<Field> fields = baron.getFarm().getFields();
        for (Field field : fields) {
            List<Crop> crops = field.getCropsInAllRows();
            for (Crop crop : crops) {
                if (crop instanceof CornStalk) {
                    crop.harvest();
                    crop.fertilize();
                    Edible earCorn = crop.yield();
                    if (earCorn != null) {
                        // Downcast because if it is of type CornStalk, we know it is EarCorn.
                        earCornList.add((EarCorn) earCorn);
                    }
                }
            }
        }

        // Feed Horses
        List<Horse> horses = baron.getFarm().getAllHorses();

        String actual = "";
        for (Horse horse : horses) {
            EarCorn earCorn = earCornList.remove(earCornList.size() - 1);
            actual = horse.eat(earCorn);
        }

        Assert.assertEquals("Horse eats the edible. He seems to really like it!", actual);
    }

    @Test
    // Assert that a CropRow has 3 additional items.
    public void plantCrops() {
        List<CropRow> cropRows = baron.getFarm().getAllCropRows();
        int sizeBefore = cropRows.get(0).getCrops().size();
        for (CropRow cropRow : cropRows) {
            cropRow.plantCrops(new TomatoPlant(), new CornStalk(), new TomatoPlant());
        }

        int expected = sizeBefore + 3;
        int actual = cropRows.get(0).getCrops().size();

        Assert.assertEquals(expected, actual);
    }
}




















