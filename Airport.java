import java.util.HashSet;
import java.util.List;
import java.util.Set;

import aircraft.Aircraft;
import person.Attendant;
import person.Passenger;
import person.Person;
import transit.Transit;
import transit.Mercedes;
import aircraft.Cessna; // aircraft used for testing
import aircraft.SR71; // aircraft used for testing

public class Airport {
    private final Set<Aircraft> aircrafts = new HashSet<>();
    private final Set<Person> persons = new HashSet<>();
    private final Set<Transit> transits = new HashSet<>();

    public final String name;
    public final String address;

    /**
     * Constructs a new Airport.
     * 
     * @param name
     * @param address
     */
    public Airport(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Adds the given aircrafts to the airport (if they aren't in the airport already).
     */
    public void addAircrafts(Aircraft ...aircrafts) {
        this.aircrafts.addAll(List.of(aircrafts));
    }

    /**
     * Adds the given persons into the airport (if they aren't in the airport already).
     */
    public void addPersons(Person ...persons) {
        this.persons.addAll(List.of(persons));
    }

    /**
     * Adds the given transits into the airport (if they aren't in the airport already).
     */
    public void addTransits(Transit ...transits) {
        this.transits.addAll(List.of(transits));
    }

    /**
     * Iterates through all people, calling their tasks and updating all aircrafts. The status of all people / aircrafts will also
     * be printed.
     */
    public void iterate() {
        persons.forEach(p -> p.randomAction());
        aircrafts.forEach(a -> a.randomAction());
        transits.forEach(t -> t.randomAction());

        System.out.println();

        persons.forEach(p -> p.logStatus());
        aircrafts.forEach(a -> a.logStatus());
        transits.forEach(t -> t.logStatus());
    }

    public static void main(String[] args){

        // testing objects 
        Cessna myCessna = new Cessna();
        SR71 mySR71 = new SR71();
        Attendant myAttendant = new Attendant("Peter Nizar", myCessna);
        Passenger myPassenger = new Passenger("Arabi", mySR71);
        Mercedes myMercedes = new Mercedes();

        Airport myAirportTest = new Airport("JFK", "111-11 Street");
        
        myAirportTest.addAircrafts(myCessna, mySR71);
        myAirportTest.addPersons(myAttendant, myPassenger);
        myAirportTest.addTransits(myMercedes);

        myAirportTest.iterate();
    }
}
