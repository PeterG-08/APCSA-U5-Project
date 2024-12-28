package person;

import aircraft.Aircraft;

public class Pilot extends Person {
    public Pilot(String name, Aircraft aircraft) {
        super(name, "Pilot", aircraft);
    }

    @Override
    public void doTask() {
        aircraft.setThrottle(0.7);
    }

    @Override
    public void speak() {
        log("This is your pilot speaking. The weather today is clear...");
    }
}
