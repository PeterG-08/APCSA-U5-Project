package aircraft;

public class Aircraft {
    private static int serialCounter = 0;

    public final int serialNumber;

    /**
     * Constructs a new Aircraft with a unique serial number.
     */
    public Aircraft() {
        serialNumber = serialCounter ++;
    }

    @Override
    public boolean equals(Object obj) {
        // two aircrafts are only equal if they share the same serial number
        return ((Aircraft) obj).serialNumber == serialNumber;
    }
}
