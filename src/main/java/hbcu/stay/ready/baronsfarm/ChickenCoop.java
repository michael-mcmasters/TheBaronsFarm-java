package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickenList;

    public ChickenCoop() {

    }

    public ChickenCoop(int numOfChickens) {
        chickenList = new ArrayList<>();
        addChicken((numOfChickens));
    }

    public void addChicken(int numOfChickens) {
        while (numOfChickens > 0) {
            chickenList.add(new Chicken());
            numOfChickens--;
        }
    }

    public ArrayList<Chicken> getChickenList() {
        return chickenList;
    }
}
