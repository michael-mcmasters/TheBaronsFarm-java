package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.*;

public class Farmer extends Person implements Rider, Botanist {

    private Farm farm;

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public void mouseRideable(Rideable rideable) {

    }

    public void dismountRideable(Rideable rideable) {

    }

    public void plant(Crop crop, CropRow cropRow) {

    }
}
