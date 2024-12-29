package person;

import aircraft.Aircraft;

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

        aircraft.setFlying(true);
        aircraft.setGearUp(true);

        log("Setting " + aircraft.name + " throttle to " + t + " and bringing the gear up.");
        aircraft.setThrottle(t);
    }

    @Override
    public void speak() {
        log("This is your pilot speaking. The weather today is clear...");
    }
}
