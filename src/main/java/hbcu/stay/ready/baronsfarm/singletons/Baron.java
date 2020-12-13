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
        Stable stable1 = new Stable(3);
        Stable stable2 = new Stable(3);
        Stable stable3 = new Stable(4);
        return (ArrayList) List.of(stable1, stable2, stable3);
    }

    private ArrayList<ChickenCoop> getChickenCoops() {
        ChickenCoop chickenCoop1 = new ChickenCoop(4);
        ChickenCoop chickenCoop2 = new ChickenCoop(4);
        ChickenCoop chickenCoop3 = new ChickenCoop(4);
        ChickenCoop chickenCoop4 = new ChickenCoop(3);
        return (ArrayList) List.of(chickenCoop1, chickenCoop2, chickenCoop3, chickenCoop4);
    }

    private ArrayList<Field> getField() {
        CropRow cropRow1 = new CropRow(new CornStalk());
        CropRow cropRow2 = new CropRow(new TomatoPlant());
        CropRow cropRow3 = new CropRow(new CornStalk());
        CropRow cropRow4 = new CropRow(new CornStalk());
        CropRow cropRow5 = new CropRow(new TomatoPlant());
        Field field = new Field(cropRow1, cropRow2, cropRow3, cropRow4, cropRow5);
        return (ArrayList) List.of(field);
    }

    private FarmHouse getFarmHouse() {
        FarmHouse farmHouse = new FarmHouse(this);
        farmHouse.addVehicles(new Tractor(), new Tractor(), new CropDuster(), new CropDuster());
        return farmHouse;
    }
}
