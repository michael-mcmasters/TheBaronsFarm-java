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
        //EarCorn earCorn = new EarCorn();
        //Baron.getInstance().getFarm().getFields();

        Farm farm = new Farm(1, 1, 1, new FarmHouse());
        Baron.getInstance().setFarm(farm);
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
