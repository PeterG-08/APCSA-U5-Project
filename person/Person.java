package person;

import aircraft.Aircraft;
import util.Base;

public abstract class Person extends Base {
    private static int idCounter = 0;

    public final String name;
    public final String type;
    public final Aircraft aircraft;

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

        logName = name + " (" + type + ") - " + id;

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
    public void logStatus() {
        log("Status - I am a " + type + " on a " + aircraft.name + "and" + (isHungry ? " I am hungry." : " I am not hungry."));
    }

    @Override
    public boolean equals(Object obj) {
        // two persons are only equal if they share the same id
        return ((Person) obj).id == id;
    }
}
