package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.interfaces.Person;
import hbcu.stay.ready.baronsfarm.interfaces.Vehicle;

import java.util.ArrayList;
import java.util.Collections;

public class FarmHouse {

    private ArrayList<Person> personList;
    private ArrayList<Vehicle> vehiclesList;

    public FarmHouse() {
        personList = new ArrayList<>();
        vehiclesList = new ArrayList<>();
    }

    public FarmHouse(Person... persons) {
        this.personList = new ArrayList<>();
        this.vehiclesList = new ArrayList<>();
        addPersons(persons);
    }

    public void addPersons(Person... persons) {
        Collections.addAll(personList, persons);
    }

    // ToDo: make test
    public void addVehicles(Vehicle... vehicles) {
        Collections.addAll(vehiclesList, vehicles);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    // ToDo: make test
    public ArrayList<Vehicle> getVehicleList() {
        return vehiclesList;
    }
}