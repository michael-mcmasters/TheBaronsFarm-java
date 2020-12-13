package hbcu.stay.ready.baronsfarm.singletons;

import hbcu.stay.ready.baronsfarm.*;
import hbcu.stay.ready.baronsfarm.interfaces.FarmVehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baron extends Farmer {

    private static Baron instance;

    private Baron() {
        ArrayList<Stable> stables = getStables();
        ArrayList<ChickenCoop> chickenCoops = getChickenCoops();
        ArrayList<Field> fields = getField();
        FarmHouse farmHouse = new FarmHouse(new Farmer(new Farm()));

        Farm farm = new Farm(stables, chickenCoops, fields, farmHouse);
    }

    public static Baron getInstance() {
        if (instance == null) {
            instance = new Baron();
        }
        return instance;
    }

    private ArrayList<Stable> getStables() {
        ArrayList<Stable> stables = new ArrayList<>();
        stables.add(new Stable(3));
        stables.add(new Stable(3));
        stables.add(new Stable(4));
        return stables;
    }

    private ArrayList<ChickenCoop> getChickenCoops() {
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(4));
        chickenCoops.add(new ChickenCoop(3));
        return chickenCoops;
    }

    private ArrayList<Field> getField() {
        CropRow cropRow1 = new CropRow(new CornStalk());
        CropRow cropRow2 = new CropRow(new TomatoPlant());
        CropRow cropRow3 = new CropRow(new CornStalk());
        CropRow cropRow4 = new CropRow(new CornStalk());
        CropRow cropRow5 = new CropRow(new TomatoPlant());
        Field field = new Field(cropRow1, cropRow2, cropRow3, cropRow4, cropRow5);
        ArrayList<Field> fields = new ArrayList<>();
        fields.add(field);
        return fields;
    }

    private FarmHouse getFarmHouse() {
        FarmHouse farmHouse = new FarmHouse(this);
        farmHouse.addVehicles(new Tractor(), new Tractor(), new CropDuster(), new CropDuster());
        return farmHouse;
    }
}
