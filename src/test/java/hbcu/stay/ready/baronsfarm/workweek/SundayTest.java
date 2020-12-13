package hbcu.stay.ready.baronsfarm.workweek;

import hbcu.stay.ready.baronsfarm.*;
import hbcu.stay.ready.baronsfarm.singletons.Baron;
import hbcu.stay.ready.baronsfarm.singletons.Baroness;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class SundayTest {

    private final Baron baron = Baron.getInstance();
    private final Baroness baroness = Baroness.getInstance();

    @BeforeClass
    public static void setUp() {
        Farm farm = new Farm(1, 1, 1, new FarmHouse());
        Baron.getInstance().setFarm(farm);

        CropRow cropRow1 = new CropRow(new CornStalk());
        CropRow cropRow2 = new CropRow(new TomatoPlant());
        CropRow cropRow3 = new CropRow(new CornStalk());
        CropRow cropRow4 = new CropRow(new CornStalk());
        CropRow cropRow5 = new CropRow(new TomatoPlant());
        Field field = new Field(cropRow1, cropRow2, cropRow3, cropRow4, cropRow5);
        farm.addFields(field);









        CornStalk cornStalk1 = new CornStalk();
        CornStalk cornStalk2 = new CornStalk();
        CornStalk cornStalk3 = new CornStalk();
        cornStalk1.harvest();
        cornStalk1.fertilize();
        cornStalk2.harvest();
        cornStalk2.fertilize();
        cornStalk3.harvest();
        cornStalk3.fertilize();
        farm.getFields().get(0).getCropRows().get(0).plantCrop(cornStalk1, cornStalk2, cornStalk3);
    }

    @Test
    public void sundayTest() {
        ArrayList<Stable> stables = baron.getFarm().getStables();
        stables.forEach(s -> s.addHorses(new Horse(), new Horse(), new Horse(), new Horse(), new Horse()));


        ArrayList<Horse> horses = new ArrayList<>();
        stables.forEach(s -> horses.addAll(s.getHorseList()));

        System.out.println(horses.size());

//        for (Horse horse : horses) {
//            baron.mountRideable(horse);
//            baroness.mountRideable(horse);
//
//            EarCorn earCorn = new EarCorn();
//            //horse.eat()
//        }
    }
}
