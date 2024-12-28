package person;

import util.Logged;

public class Person extends Logged {
    private static int idCounter = 0;

    public final String name;
    public final int id;

    /**
     * Constructs a new Person with a unique id.
     */
    public Person(String name) {
        this.name = name;

        id = idCounter ++;

        logName = name + " - " + id;
    }

    @Override
    public boolean equals(Object obj) {
        // two persons are only equal if they share the same id
        return ((Person) obj).id == id;
    }
}
