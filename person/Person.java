package person;

import aircraft.Aircraft;
import transit.Transit;
import util.Base;
import aircraft.Cessna; // aircraft used for testing
import aircraft.SR71; // aircraft used for testing

public abstract class Person extends Base {
    private static int idCounter = 0;

    public final String name;
    public final String type;
    public  Aircraft aircraft;
    public Transit transit;
    public final int id;

    protected boolean isHungry = false;

    /**
     * Constructs a new Person with a unique id.
     */
    public Person(String name, String type, Aircraft aircraft) {
        this.name = name;
        this.type = type;
        
        this.aircraft = aircraft;
        this.aircraft.addPersons(this);

        id = idCounter ++;

        logName = name + " (" + type + ", " + aircraft.name + ") - " + id;

        addActions(this::doTask, this::speak);
    }
    public Person(String name, String type, Transit transit) {
        this.name = name;
        this.type = type;
        this.transit = transit;

        id = idCounter ++;

        logName = name + " (" + type + ", " + transit.name + ") - " + id;

        addActions(this::doTask, this::speak);
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    /** Performs the task that this person does. */
    public abstract void doTask();

    /** Says some dialogue this person says. */
    public abstract void speak();

    @Override
    public final void logStatus() {
        String tName = aircraft != null ? aircraft.name : transit.name;

        log("Status - I am a " + type + " on a " + tName + " and" + (isHungry ? " I am hungry." : " I am not hungry."));
    }


    @Override
    public boolean equals(Object obj) {
        // two persons are only equal if they share the same id
        return ((Person) obj).id == id;
    }
}
