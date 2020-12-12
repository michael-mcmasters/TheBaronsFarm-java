package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;
import java.util.Collections;

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
}
