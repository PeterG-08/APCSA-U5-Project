package aircraft;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import person.Person;
import util.Logged;

public class Aircraft extends Logged {
    private static int serialCounter = 0;

    public final String name;

    public final int serialNumber;
    public final double maxSpeedMph;

    private boolean gearUp = false;
    private double currentSpeed = 0;
    private boolean isFlying = false;

    private final Set<Person> persons = new HashSet<>();

    /**
     * Constructs a new Aircraft with a unique serial number.
     */
    public Aircraft(String name, double maxSpeedMph) {
        serialNumber = serialCounter ++;

        this.name = name;
        this.maxSpeedMph = maxSpeedMph;

        logName = name + " - " + serialNumber;
    }

    public boolean isGearUp() {
        return gearUp;
    }

    public void setGearUp(boolean gearUp) {
        if (this.gearUp == gearUp) log("Gear already"); // TODO
        
        this.gearUp = gearUp;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean isFlying) {
        if (isFlying && !gearUp) log("In flight! Bring the gear up!");

        this.isFlying = isFlying;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void addPersons(Person... persons) {
        this.persons.addAll(List.of(persons));
    }

    /**
     * Sets the speed throttle from [0, 1] (0 -> no speed, 1 -> max speed).
     */
    public void setThrottle(double throttle) {
        currentSpeed = throttle * maxSpeedMph;
    }

    @Override
    public void logStatus() {
        log("butthole");
    }

    @Override
    public boolean equals(Object obj) {
        // two aircrafts are only equal if they share the same serial number
        return ((Aircraft) obj).serialNumber == serialNumber;
    }
}
