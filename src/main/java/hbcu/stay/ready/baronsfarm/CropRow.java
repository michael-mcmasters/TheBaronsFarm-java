package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;

import java.util.ArrayList;
import java.util.Collections;

public class CropRow {

    private ArrayList<Crop> crops;

    public CropRow(Crop... crops) {
        this.crops = new ArrayList<>();
        plantCrops(crops);
    }

    // Crops are "planted" by being added to the list.
    public void plantCrops(Crop... newCrops) {
        Collections.addAll(crops, newCrops);
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }
}
