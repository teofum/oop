package Parcial1_2023_C2.E02;

public class AirlineLounge extends LimitedLounge {
    private final String airline;

    public AirlineLounge(String name, LoungeCentral central, int capacity, String airline) {
        super(name, central, capacity);
        this.airline = airline;
    }

    @Override
    public void enter(Passenger passenger) {
        if (!passenger.getAirline().equals(airline)) throw new IllegalStateException("Cannot enter lounge");
        super.enter(passenger);
    }

    @Override
    public String toString() {
        return airline + " " + super.toString();
    }
}
