package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.*;

public class Farmer extends Person implements Rider, Botanist {

    private Farm farm;

    public Farmer() {
        this.farm = new Farm();
    }

    public Farmer(Farm farm) {
        this.farm = farm;
    }

    public void mountRideable(Rideable rideable) {
        System.out.println("Wooooo!");
    }

    public void dismountRideable(Rideable rideable) {
        System.out.println("Aw :(");
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }
}
