package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;
import java.util.Collections;

public class Stable {
    private ArrayList<Horse> horseList;

    public Stable() {
        horseList = new ArrayList<>();
    }

    public Stable(Horse... horses) {
        horseList = new ArrayList<>();
        addHorses(horses);
    }

    public void addHorses (Horse... horses) {
        Collections.addAll(horseList, horses);
    }

    public ArrayList<Horse> getHorseList() {
        return horseList;
    }
}
