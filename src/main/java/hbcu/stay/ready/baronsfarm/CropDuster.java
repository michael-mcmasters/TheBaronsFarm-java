package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Aircraft;
import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;

import java.util.ArrayList;

public class CropDuster implements FarmVehicle, Aircraft {

    // Operate on entire farm. All fields.
    public void operate(Farm farm) {
        ArrayList<Field> fields = farm.getFieldList();
        for (Field field : fields) {
            fertilize(field);
        }
    }

    // Fly over specific field. Not entire farm.
    @Override
    public void fly(Field field) {
        fertilize(field);
    }

    // Field holds CropRow(s). Fertilize Crop(s) in CropRow(s).
    private void fertilize(Field field) {
        ArrayList<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow : cropRows) {
            ArrayList<Crop> crops = cropRow.getCrops();
            for (Crop crop : crops) {
                crop.fertilize();
            }
        }
    }

    public String makeNoise() {
        return "Swish";
    }
}
