package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.enums.CropType;
import hbcu.stay.ready.baronsfarm.interfaces.Crop;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Farm {

    private ArrayList<Stable> stableList;
    private ArrayList<ChickenCoop> chickenCoopList;
    private ArrayList<Field> fieldList;
    private FarmHouse farmHouse;

    public Farm() {
        this.stableList = new ArrayList<>();
        this.chickenCoopList = new ArrayList<>();
        this.fieldList = new ArrayList<>();
        this.farmHouse = new FarmHouse(new Farmer(this));
    }

    // ToDo: create test for this constructor.
    public Farm(int numOfStables, int numOfChickenCoops, int numOfFields, FarmHouse farmHouse) {
        this.stableList = new ArrayList<>();
        this.chickenCoopList = new ArrayList<>();
        this.fieldList = new ArrayList<>();
        this.farmHouse = new FarmHouse(new Farmer(this));
        while (numOfStables > 0) {
            addStables(new Stable());
            numOfStables--;
        }
        while (numOfChickenCoops > 0) {
            addChickenCoops(new ChickenCoop());
            numOfChickenCoops--;
        }
        while (numOfFields > 0) {
            addFields(new Field());
            numOfFields--;
        }
        this.farmHouse = farmHouse;
    }

    public Farm(ArrayList<Stable> stableList, ArrayList<ChickenCoop> chickenCoopList, ArrayList<Field> fieldList, FarmHouse farmHouse) {
        this.stableList = stableList;
        this.chickenCoopList = chickenCoopList;
        this.fieldList = fieldList;
        this.farmHouse = farmHouse;
    }

    public void addStables(Stable... stables) {
        Collections.addAll(stableList, stables);
    }

    public void addChickenCoops(ChickenCoop... chickenCoops) {
        Collections.addAll(chickenCoopList, chickenCoops);
    }

    public void addFields(Field... fields) {
        Collections.addAll(fieldList, fields);
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public ArrayList<Stable> getStables() {
        return stableList;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoopList;
    }

    public ArrayList<Field> getFields() {
        return fieldList;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    // ToDo: make test.
    public List<CropRow> getAllCropRows() {
        List<CropRow> cropRows = new ArrayList<>();
        for (Field field : fieldList) {
            List<CropRow> cr = field.getCropRows();
            cr.forEach(c -> cropRows.add(c));
        }
        return cropRows;
    }

    // ToDo: make test.
    public List<Horse> getAllHorses() {
        List<Horse> horses = new ArrayList<>();
        stableList.forEach(s -> horses.addAll(s.getHorseList()));
        return horses;
    }

    public List<Edible> getCropOfType(CropType cropType) {
        List<Crop> crops = getAllCrops();
        if (cropType == CropType.CORNSTALK) {

            List<Edible> earCorns = new ArrayList<>();
            for (Crop crop : crops) {
                crop.fertilize();
                crop.harvest();
                if (crop instanceof CornStalk) {
                    Edible edible = crop.yield();
                    if (edible != null) {
                        earCorns.add(edible);
                    }
                }
            }
            return earCorns;


        } else if (cropType == CropType.TOMATOPLANT) {

        }
        return null;
    }

    // ToDo: make test.
    public List<Crop> getAllCrops() {
        List<Crop> crops = new ArrayList<>();
        for (Field field : fieldList) {
            List<Crop> cropsInRow = field.getCropsInAllRows();
            for (Crop c : cropsInRow) {
                crops.add(c);
            }
        }
        return crops;
    }
}





























