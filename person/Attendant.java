package person;

import aircraft.Aircraft;
import aircraft.Cessna; // aircraft used for testing
import aircraft.SR71; // aircraft used for testing

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
    
    public static void main(String[] args){

        // testing aircrafts 
        Cessna myCessna = new Cessna();
        SR71 mySR71 = new SR71();

        Attendant myAttendantTest = new Attendant("Peter", myCessna); // id 0
        myAttendantTest.announcement();
        myAttendantTest.doTask();
        myAttendantTest.speak();

        Attendant myAttendantTest2 = new Attendant("Nizar", mySR71); // id 1
        myAttendantTest2.announcement();

    }
}
