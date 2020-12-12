package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class Field {

    private ArrayList<CropRow> cropRows;

    public Field(int numOfCropRows) {
        cropRows = new ArrayList<>();
        addCropRow(numOfCropRows);
    }

    public Field(CropRow cropRow) {
        this.cropRows = new ArrayList<CropRow>();
        cropRows.add(cropRow);
    }

    public Field(ArrayList<CropRow> cropRows) {
        this.cropRows = cropRows;
    }

    public void addCropRow(int numOfCropRows) {
        while (numOfCropRows > 0) {
            cropRows.add(new CropRow());
            numOfCropRows--;
        }
    }

    public void addCropRow(CropRow cropRow) {

    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }
}
