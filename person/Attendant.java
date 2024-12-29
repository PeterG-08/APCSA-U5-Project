package person;

import aircraft.Aircraft;

public class Attendant extends Person {
    public Attendant(String name, Aircraft aircraft) {
        super(name, "Attendant", aircraft);

        addActions(this::announcement);
    }

    public void announcement() {
        log("Welcome aboard!");
    }

    @Override
    public void doTask() {
        log("Serving drinks and snacks!");

        for (Person person : aircraft.getPersons()) {
           person.setIsHungry(false);
        }
    }

    @Override
    public void speak() {
        log("Please fasten your seatbelt.");
    }
}
