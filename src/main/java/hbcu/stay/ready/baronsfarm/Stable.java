package hbcu.stay.ready.baronsfarm;

import java.util.ArrayList;
import java.util.Collections;

public class Stable {
    private ArrayList<Horse> horseList;

    public Stable() {
        horseList = new ArrayList<>();
    }

    // Todo: add test
    public Stable(int numOfHorses) {
        this.horseList = new ArrayList<>();
        for (int i = 0; i < numOfHorses; i++) {
            addHorses(new Horse());
        }
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
