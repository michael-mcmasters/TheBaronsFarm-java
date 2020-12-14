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

    public String mountRideable(Rideable rideable) {
        String sound = "";
        if (rideable != null) {
            sound += "Wooooo!";
            System.out.println(sound);
        }
        return sound;
    }

    public String dismountRideable(Rideable rideable) {
        String sound = "";
        if (rideable != null) {
            sound += "Aw :(";
            System.out.println(sound);
        }
        return sound;
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.plantCrops(crop);
    }

    public Farm getFarm() {
        return farm;
    }

    // ToDo: create test for this.
    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    @Override
    public String eat(Edible edible) {
        return "The farmer eats the edible";
    }

    @Override
    public String makeNoise() {
        return "We are farmers. Dun dun dun dun dun dun dun dun.";
    }
}
