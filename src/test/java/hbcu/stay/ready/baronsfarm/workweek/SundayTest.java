package hbcu.stay.ready.baronsfarm.workweek;

import hbcu.stay.ready.baronsfarm.EarCorn;
import hbcu.stay.ready.baronsfarm.Horse;
import hbcu.stay.ready.baronsfarm.Stable;
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
        EarCorn earCorn = new EarCorn();
        Baron.getInstance().getFarm().getFields();
    }

    @Test
    public void sundayTest() {
        ArrayList<Stable> stables = Baron.getInstance().getFarm().getStables();
        stables.forEach(s -> s.addHorses(new Horse(), new Horse(), new Horse(), new Horse()));
        ArrayList<Horse> horses = new ArrayList<>();
        stables.forEach(s -> horses.addAll(s.getHorseList()));

        System.out.println(horses);

//        for (Horse horse : horses) {
//            baron.mountRideable(horse);
//            baroness.mountRideable(horse);
//
//            EarCorn earCorn = new EarCorn();
//            //horse.eat()
//        }
    }
}
