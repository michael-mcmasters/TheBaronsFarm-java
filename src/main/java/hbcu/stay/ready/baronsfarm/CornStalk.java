package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

public class CornStalk extends Crop {

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void harvest() {
        super.hasBeenHarvested = true;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public EarCorn yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            return new EarCorn();
        }
        return null;
    }
}
