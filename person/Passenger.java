package person;

import aircraft.Aircraft;
import transit.Transit;
import aircraft.Cessna; // aircraft used for testing
import aircraft.SR71; // aircraft used for testing

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

    public static void main(String[] args){

        // testing aircrafts 
        Cessna myCessna = new Cessna();
        SR71 mySR71 = new SR71();

        Passenger myPassengerTest = new Passenger("Peter", myCessna); // id 0
        myPassengerTest.purchaseTicket();
        myPassengerTest.doTask();
        myPassengerTest.speak();

        Passenger myPassengerTest2 = new Passenger("Nizar", mySR71); // id 1
        myPassengerTest2.purchaseTicket();

    }
    
}
