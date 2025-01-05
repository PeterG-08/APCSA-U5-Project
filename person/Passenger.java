package person;

import aircraft.Aircraft;
import transit.Transit;

public class Passenger extends Person {
    public Passenger(String name, Aircraft aircraft) {
        super(name, "Passenger", aircraft);

        isHungry = true;

        addActions(this::purchaseTicket);
    }
    public Passenger(String name, Transit aircraft) {
        super(name, "Passenger", aircraft);

        isHungry = true;

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
        String dialogue =  aircraft != null ? "How much longer is this flight?" : "How much longer is this ride?";
        
        log(dialogue);
    }
    
}
