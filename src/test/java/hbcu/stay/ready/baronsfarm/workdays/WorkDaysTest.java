package hbcu.stay.ready.baronsfarm.workdays;

import hbcu.stay.ready.baronsfarm.Farm;
import hbcu.stay.ready.baronsfarm.Farmer;
import hbcu.stay.ready.baronsfarm.Pilot;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WorkDaysTest {

    private final Farmer baron = new Farmer(new Farm());
    private final Pilot baroness = new Pilot();

    @Before
    public void everyMorning() {
        //System.out.println("morning!");
    }

    @Test
    @Order(1)
    public void sunday() {
        System.out.println("sunday!");
    }

    @Test
    @Order(2)
    public void monday() {
        System.out.println("monday!");
    }

    @Test
    @Order(3)
    public void tuesday() {
        System.out.println("tuesday!");
    }

    @Test
    @Order(4)
    public void wednesday() {
        System.out.println("wednesday!");
    }

    @Test
    @Order(5)
    public void thursday() {
        System.out.println("thursday!");
    }

    @Test
    @Order(6)
    public void friday() {
        System.out.println("friday!");
    }

    @Test
    @Order(7)
    public void saturday() {
        System.out.println("saturday!");
    }
}
