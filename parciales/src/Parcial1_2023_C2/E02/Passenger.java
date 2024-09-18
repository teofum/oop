package Parcial1_2023_C2.E02;

public class Passenger {
    private final String name, airline;
    private int passCount;

    public Passenger(String name, String airline, int passCount) {
        if (passCount <= 0) throw new IllegalArgumentException("Pass count must be positive");

        this.name = name;
        this.airline = airline;
        this.passCount = passCount;
    }

    public String getName() {
        return name;
    }

    public String getAirline() {
        return airline;
    }

    public void usePass() {
        if (passCount == 0) throw new IllegalStateException("No passes left");

        passCount--;
    }
}
