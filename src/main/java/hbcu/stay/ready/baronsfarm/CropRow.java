package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> crops;

    public CropRow(Crop... crops) {
        this.crops = new ArrayList<>();
        for (Crop c : crops) {
            plantCrop(c);
        }
    }

    // Adds plant to list.
    public void plantCrop(Crop crop) {
        crops.add(crop);
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }
}
