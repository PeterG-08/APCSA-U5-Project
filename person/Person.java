package person;

import aircraft.Aircraft;
import util.Logged;

public abstract class Person extends Logged {
    private static int idCounter = 0;

    public final String name;
    public final String type;
    public final Aircraft aircraft;

    public final int id;

    /**
     * Constructs a new Person with a unique id.
     */
    public Person(String name, String type, Aircraft aircraft) {
        this.name = name;
        this.type = type;
        
        this.aircraft = aircraft;
        this.aircraft.addPersons(this);

        id = idCounter ++;

        logName = name + " (" + type + ") - " + id;
    }

    /** Performs the task that this person does. */
    public abstract void doTask();

    /** Says some dialogue this person says. */
    public abstract void speak();

    @Override
    public void logStatus() {
        log("I am a " + type + " on a " + aircraft.name);
    }

    @Override
    public boolean equals(Object obj) {
        // two persons are only equal if they share the same id
        return ((Person) obj).id == id;
    }
}
