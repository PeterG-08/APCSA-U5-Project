import aircraft.Cessna;
import person.Pilot;

class Main {
    public static void main(String[] args) {
        Airport jfk = new Airport("JFK", "queens idk");

        Cessna cessna = new Cessna();
        Pilot peter = new Pilot("Peter", cessna);
    
        jfk.addAircrafts(cessna);
        jfk.addPersons(peter);

        jfk.iterate();
    }
}
 