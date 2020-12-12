package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Produce;

public class Chicken extends Produce implements Animal {

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public String makeNoise() {
        return "bwuak";
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public Edible yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            EdibleEgg egg = new EdibleEgg();
            return egg;
        }
        return null;
    }

    @Override
    public void eat(Edible edible) {
        System.out.println("Chicken eats an edible. He seems to like it.");
    }
}
