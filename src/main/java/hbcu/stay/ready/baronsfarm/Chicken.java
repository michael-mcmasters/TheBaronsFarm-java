package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Produce;

public class Chicken extends Animal implements Produce {

    public void makeNoise() {

    }

    public void harvest() {

    }

    public void fertilize() {

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
