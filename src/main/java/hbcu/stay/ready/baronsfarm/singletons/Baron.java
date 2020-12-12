package hbcu.stay.ready.baronsfarm.singletons;

import hbcu.stay.ready.baronsfarm.Farmer;

public class Baron extends Farmer {

    private static Baron instance;

    public static Baron getInstance() {
        if (instance == null) {
            instance = new Baron();
        }
        return instance;
    }
}
