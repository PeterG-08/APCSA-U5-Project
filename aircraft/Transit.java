package aircraft;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import person.Person;
import util.Base;

public abstract class Transit extends Base {
    private static int plateCounter = 0;
    public final String name;

    public final int platelNumber;
    public final double maxSpeedMph;

    private boolean engineStart = false;
    private double currentSpeed = 0;
    private boolean isdriving = false;

    private final Set<Person> persons = new HashSet<>();

    /**
     * Constructs a new Aircraft with a unique serial number.
     */
    public Transit(String name, double maxSpeedMph) {
        platelNumber=plateCounter++;

        this.name = name;
        this.maxSpeedMph = maxSpeedMph;

        logName = name + " - " + platelNumber;

        addActions(this::doStunt, this::makeSound);
    }

    protected Transit(String name, int plateNumber, double maxSpeedMph) {
        this.name = name;
        this.platelNumber = plateNumber;
        this.maxSpeedMph = maxSpeedMph;
    }

    public boolean isEngineStart() {
        return engineStart;
    }

    public void setEngineStart(boolean engineStart) {
        this.engineStart = engineStart;
    }

    public boolean isIsdriving() {
        return isdriving;
    }

    public void setIsdriving(boolean isDrivng) {
        if (isdriving && !engineStart) log("Time to drive! Im starting the engine!");

        this.isdriving = isDrivng;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void addPersons(Person... persons) {
        this.persons.addAll(List.of(persons));
    }

    public Set<Person> getPersons() {
        return persons;
    }

    /**
     * Sets the speed throttle from [0, 1] (0 -> no speed, 1 -> max speed).
     */
    public void setThrottle(double throttle) {
        currentSpeed = throttle * maxSpeedMph;
    }

    /** Performs the stunt that this aircraft does. */
    public abstract void doStunt();

    /** Makes the sound that this aircraft makes. */
    public abstract void makeSound();

    @Override
    public void logStatus() {
        log("Status - Engine on: " + engineStart + ", driving: " + isdriving + ", speed: " + currentSpeed + " mph.");
    }

    @Override
    public boolean equals(Object obj) {
        // two cars are only equal if they share the same plate number
        return ((Transit) obj).platelNumber == platelNumber;
    }

}
