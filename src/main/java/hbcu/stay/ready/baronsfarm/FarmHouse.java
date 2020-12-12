package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Person;

import java.util.ArrayList;

public class FarmHouse {

    private ArrayList<Person> personList;

    public FarmHouse() {
        personList = new ArrayList<>();
    }

    public FarmHouse(Person person) {
        this.personList = new ArrayList<>();
        personList.add(person);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}