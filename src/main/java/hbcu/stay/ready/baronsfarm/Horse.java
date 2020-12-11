package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse implements Rideable, Animal {

    public String makeNoise() {
        return null;
    }

    @Override
    public void eat(Edible edible) {

    }
}
