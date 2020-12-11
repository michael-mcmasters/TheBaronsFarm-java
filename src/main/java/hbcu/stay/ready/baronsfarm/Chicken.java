package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Produce;

public class Chicken extends Produce implements Animal {

    public String makeNoise() {
        return "bwuak";
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public void fertilize() {

    }

    @Override
    public void eat(Edible edible) {

    }

    public Edible yield() {
        return null;
    }

    public Boolean getHasBeenHarvested() {
        return null;
    }

    public Boolean hasBeenFertilized() {
        return null;
    }

}
