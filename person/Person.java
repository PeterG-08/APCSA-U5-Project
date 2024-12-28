package person;

public class Person {
    private static int idCounter = 0;

    public final int id;

    /**
     * Constructs a new Person with a unique id.
     */
    public Person() {
        id = idCounter ++;
    }

    @Override
    public boolean equals(Object obj) {
        // two persons are only equal if they share the same id
        return ((Person) obj).id == id;
    }
}
