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

    }

    public ArrayList<Stable> getStableList() {
        return stableList;
    }

    public ArrayList<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public ArrayList<Field> getFieldList() { return fieldList; }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void addToFieldList(Field... fields) {
        Collections.addAll(fieldList, fields);
    }
}