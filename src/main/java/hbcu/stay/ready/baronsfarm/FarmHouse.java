package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Person;

import java.util.ArrayList;

public class FarmHouse {

    private ArrayList<Person> personList;

    public FarmHouse() {
        personList = new ArrayList<Person>();
    }

    public FarmHouse(Person person) {
        this.personList = new ArrayList<>();
        personList.add(person);
    }

    public FarmHouse(ArrayList<Person> persons) {
        this.personList = persons;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
