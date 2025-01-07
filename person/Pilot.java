package person;

import aircraft.Aircraft;
import aircraft.Cessna; // aircraft used for testing
import aircraft.SR71; // aircraft used for testing

public class Pilot extends Person {
    public Pilot(String name, Aircraft aircraft) {
        super(name, "Pilot", aircraft);

        addActions(this::turnOnAutoPilot);
    }

    public void turnOnAutoPilot() {
        log("Turning on autopilot.");
    }

    @Override
    public void doTask() {
        double t = Math.random();
        t = (double) ((int) (t * 100));
        t /= 100;

        aircraft.setGearUp(true);
        aircraft.setFlying(true);

        log("Setting " + aircraft.name + " throttle to " + t + " and bringing the gear up.");
        aircraft.setThrottle(t);
    }

    @Override
    public void speak() {
        log("This is your pilot speaking. The weather today is clear...");
    }

    public static void main(String[] args){

        // testing aircrafts 
        Cessna myCessna = new Cessna();
        SR71 mySR71 = new SR71();

        Pilot myPilotTest = new Pilot("Peter", myCessna); // id 0
        myPilotTest.turnOnAutoPilot();
        myPilotTest.doTask();
        myPilotTest.speak();

        Pilot myPilotTest2 = new Pilot("Nizar", mySR71); // id 1
        myPilotTest2.turnOnAutoPilot();

    }
}
