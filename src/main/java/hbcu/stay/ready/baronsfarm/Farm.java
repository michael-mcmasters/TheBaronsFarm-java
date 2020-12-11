package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Crop;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Stable> stableList;
    private ArrayList<ChickenCoop> chickenCoopList;
    private ArrayList<Field> fieldList;
    private FarmHouse farmHouse;

    public Farm(ArrayList<Stable> stableList, ArrayList<ChickenCoop> chickenCoopList, ArrayList<Field> fieldList, FarmHouse farmHouse) {

    }

    public ArrayList<Stable> getStableList() {
        return stableList;
    }

    public ArrayList<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}
