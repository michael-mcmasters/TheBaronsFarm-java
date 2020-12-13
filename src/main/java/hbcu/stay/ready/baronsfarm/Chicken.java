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

    public EdibleEgg yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            EdibleEgg egg = new EdibleEgg();
            return egg;
        }
        return null;
    }

    @Override
    public String eat(Edible edible) {
        String message = "";
        if (edible != null) {
            message += "Chicken eats the edible. He seems to really like it!";
            System.out.println(message);
        }
        return message;
    }
}
