package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Animal;
import hbcu.stay.ready.baronsfarm.interfaces.Edible;
import hbcu.stay.ready.baronsfarm.interfaces.Rideable;

public class Horse implements Rideable, Animal {

    public String makeNoise() {
        return "Clickety click, heehaw heehaw, it's dominic the donkey. Or horse. Idk.";
    }

    @Override
    public String eat(Edible edible) {
        String message = "";
        if (edible != null) {
            message += "Horse eats the edible. He seems to really like it!";
            System.out.println(message);
        }
        return message;
    }
}
