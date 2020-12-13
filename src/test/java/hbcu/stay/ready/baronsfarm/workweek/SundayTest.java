package hbcu.stay.ready.baronsfarm.workweek;

import hbcu.stay.ready.baronsfarm.*;
import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.singletons.Baron;
import hbcu.stay.ready.baronsfarm.singletons.Baroness;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SundayTest {

    private final Baron baron = Baron.getInstance();
    private final Baroness baroness = Baroness.getInstance();

//    @Test
//    public void sundayTest() {
////        ArrayList<Stable> stables = baron.getFarm().getStables();
////
////        ArrayList<Horse> horses = new ArrayList<>();
////        stables.forEach(s -> horses.addAll(s.getHorseList()));
////
////        System.out.println(horses.size());
//
////        for (Horse horse : horses) {
////            baron.mountRideable(horse);
////            baroness.mountRideable(horse);
////
////            EarCorn earCorn = new EarCorn();
////            //horse.eat()
////        }
//    }


    @Test
    public void baronMountHorse() {
        List<Stable> stables = baron.getFarm().getStables();
        List<Horse> horses = new ArrayList<>();
        stables.forEach(s -> horses.addAll(s.getHorseList()));

        String actual = "";
        for (Horse horse : horses) {
            actual = baron.mountRideable(horse);
            baron.mountRideable(horse);
        }
        Assert.assertEquals("Wooooo!", actual);
    }

    @Test
    public void baronessMountHorse() {
        List<Stable> stables = baron.getFarm().getStables();
        List<Horse> horses = new ArrayList<>();
        stables.forEach(s -> horses.addAll(s.getHorseList()));

        String actual = "";
        for (Horse horse : horses) {
            actual = baroness.mountRideable(horse);
            baroness.mountRideable(horse);
        }
        Assert.assertEquals("Wooooo!", actual);
    }

    @Test
    public void feedHorse() {
//        List<Field> fields = baron.getFarm().getFields();
//        List<EarCorn> earCorn = new ArrayList<>();
//        for (Field field : fields) {
//            ArrayList
//        }

        List<Field> fields = baron.getFarm().getFields();
        List<EarCorn> earCornList = new ArrayList<>();
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
        System.out.println(earCornList.size());
    }
}




















