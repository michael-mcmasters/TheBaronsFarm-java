package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Person;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;
import hbcu.stay.ready.baronsfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {

    public String mountRideable(Rideable rideable) {
        String sound = "";
        if (rideable != null) {
            sound += "I'm so high up!";
            System.out.println(sound);
        }
        return sound;
    }

    public String dismountRideable(Rideable rideable) {
        String sound = "";
        if (rideable != null) {
            sound += "Till next time!";
            System.out.println(sound);
        }
        return sound;
    }

    @Override
    public String eat(Edible edible) {
        return "The pilot eats the edible";
    }
}
