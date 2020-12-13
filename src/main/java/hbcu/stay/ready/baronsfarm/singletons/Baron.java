package hbcu.stay.ready.baronsfarm.singletons;

import hbcu.stay.ready.baronsfarm.*;

import java.util.ArrayList;

public class Baron extends Farmer {

    private static Baron instance;

    private Baron() {
        CropRow cropRow1 = new CropRow(new CornStalk());
        CropRow cropRow2 = new CropRow(new TomatoPlant());
        CropRow cropRow3 = new CropRow(new CornStalk());
        CropRow cropRow4 = new CropRow(new CornStalk());
        CropRow cropRow5 = new CropRow(new TomatoPlant());
        Field field = new Field(cropRow1, cropRow2, cropRow3, cropRow4, cropRow5);
        ArrayList<ChickenCoop> chickenCoops;


        //Farm farm = new Farm(field);
    }

    public static Baron getInstance() {
        if (instance == null) {
            instance = new Baron();
        }
        return instance;
    }

    private void getStable() {

    }

    private void getChickenCoop() {

    }

    private void getField() {

    }
}
