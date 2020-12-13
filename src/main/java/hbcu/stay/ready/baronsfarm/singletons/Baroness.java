package hbcu.stay.ready.baronsfarm.singletons;

import hbcu.stay.ready.baronsfarm.Pilot;

public class Baroness extends Pilot {

    private static Baroness instance;

    public static Baroness getInstance() {
        if (instance == null)
            instance = new Baroness();
        return instance;
    }
}
