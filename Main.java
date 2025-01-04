import java.util.Scanner;

import aircraft.Cessna;
import aircraft.Mercedes;
import aircraft.SR71;
import person.Attendant;
import person.Passenger;
import person.Pilot;
import person.Tourist;

class Main {
    public static void main(String[] args) {
        Airport jfk = new Airport("JFK", "queens idk");

        Cessna cessna = new Cessna();
        SR71 sr71 = new SR71();
        Mercedes mercedes = new Mercedes();
        Pilot peter = new Pilot("Peter", sr71);
        Passenger bob = new Passenger("Bob", sr71);
        Attendant lisa = new Attendant("Lisa", sr71);

        Pilot john = new Pilot("John", cessna);
        Passenger alice = new Passenger("Alice", cessna);
        Attendant jessica = new Attendant("Jessica", cessna);
        Tourist arabi = new Tourist("arabi",mercedes );
        Tourist jeb = new Tourist("Jeb", mercedes);
        jfk.addAircrafts(cessna, sr71);
        jfk.addPersons(peter, bob, john, alice, lisa, jessica, arabi, jeb);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Press enter (e to exit): ");
            String in = scanner.nextLine();

            if (in.equals("e")) {
                break;
            }

            jfk.iterate();
        }

        scanner.close();
    }
}
 