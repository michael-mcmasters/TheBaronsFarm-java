package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Field {

    private ArrayList<CropRow> cropRows;

    public Field() {
        cropRows = new ArrayList<>();
    }

    public Field(CropRow... cropRow) {
        this.cropRows = new ArrayList<>();
        addCropRows(cropRow);
    }

    public void addCropRows(CropRow... cropRow) {
        Collections.addAll(cropRows, cropRow);
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }

    public List<Crop> getCropsInAllRows() {
        List<Crop> crops = new ArrayList<>();
        for (CropRow cropRow : cropRows) {
            ArrayList<Crop> cropsList2 = cropRow.getCrops();
            for (Crop c : cropsList2) {
                crops.add(c);
            }
        }
        return crops;
    }
}
