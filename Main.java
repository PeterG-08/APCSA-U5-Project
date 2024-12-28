import java.util.Scanner;

import aircraft.Cessna;
import person.Pilot;

class Main {
    public static void main(String[] args) {
        Airport jfk = new Airport("JFK", "queens idk");

        Cessna cessna = new Cessna();
        Pilot peter = new Pilot("Peter", cessna);
    
        jfk.addAircrafts(cessna);
        jfk.addPersons(peter);

        Scanner scanner = new Scanner(System.in);

        while (true) {
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
 