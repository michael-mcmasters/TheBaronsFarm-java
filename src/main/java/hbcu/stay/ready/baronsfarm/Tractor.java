package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor implements FarmVehicle {

    // Operate over entire farm.
    public void operate(Farm farm) {
        ArrayList<Field> fields = farm.getFields();
        for (Field field : fields) {
            harvest(field);
        }
    }

    // Field holds CropRow(s). Fertilize Crop(s) in CropRow(s).
    private void harvest(Field field) {
        ArrayList<CropRow> cropRows = field.getCropRows();
        for (CropRow cropRow : cropRows) {
            ArrayList<Crop> crops = cropRow.getCrops();
            for (Crop crop : crops) {
                crop.harvest();
            }
        }
    }

    public String makeNoise() {
        return "bruhbruhbruhburh";
    }
}
