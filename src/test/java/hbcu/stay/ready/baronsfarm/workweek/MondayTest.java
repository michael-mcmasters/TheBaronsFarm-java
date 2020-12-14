package hbcu.stay.ready.baronsfarm.workweek;

import hbcu.stay.ready.baronsfarm.CropDuster;
import hbcu.stay.ready.baronsfarm.EarCorn;
import hbcu.stay.ready.baronsfarm.Horse;
import hbcu.stay.ready.baronsfarm.enums.EdibleType;
import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Vehicle;
import hbcu.stay.ready.baronsfarm.singletons.Baron;
import hbcu.stay.ready.baronsfarm.singletons.Baroness;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MondayTest {

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
        List<Edible> earCornList = baron.getFarm().getEdibleOfType(EdibleType.EARCORN);
        List<Horse> horses = baron.getFarm().getAllHorses();
        String actual = "";
        for (Horse horse : horses) {
            EarCorn earCorn = (EarCorn) earCornList.remove(earCornList.size() - 1);
            actual = horse.eat(earCorn);
        }
        Assert.assertEquals("Horse eats the edible. He seems to really like it!", actual);
    }

    @Test
    public void fertilizeCrops() {
        // Fertilize
        List<Vehicle> vehicles = baron.getFarm().getFarmHouse().getVehicleList();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof CropDuster) {
                baroness.mountRideable(vehicle);
                ((CropDuster) vehicle).fly(baron.getFarm().getFields().get(0));
            }
        }

        // Verify
        List<Crop> crops = baron.getFarm().getAllCrops();
        boolean allCropsAreFertilized = true;
        for (Crop crop : crops) {
            if (!crop.getHasBeenFertilized()) {
                allCropsAreFertilized = false;
                break;
            }
        }
        Assert.assertTrue(allCropsAreFertilized);
    }

}
