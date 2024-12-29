package person;

import aircraft.Aircraft;

public class Passenger extends Person {
    public Passenger(String name, Aircraft aircraft) {
        super(name, "Passenger", aircraft);

        addActions(this::purchaseTicket);
    }

    public void purchaseTicket() {
        log("Purchasing ticket!");
    }
 
    @Override
    public void doTask() {
        log("I am a passenger. I am just sitting here.");
    }

    @Override
    public void speak() {
        log("How much longer is this flight?");
    }
    
}
