package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;

public class TomatoPlant extends Crop {
    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public Tomato yield() {
        if (hasBeenHarvested && hasBeenFertilized)
            return new Tomato();
        return null;
    }
}
