package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;
import java.util.Collections;

public class Farm {

    private ArrayList<Stable> stableList;
    private ArrayList<ChickenCoop> chickenCoopList;
    private ArrayList<Field> fieldList;
    private FarmHouse farmHouse;

    public Farm() {
        stableList = new ArrayList<>();
        chickenCoopList = new ArrayList<>();
        fieldList = new ArrayList<>();
        farmHouse = new FarmHouse(new Farmer(this));
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
}