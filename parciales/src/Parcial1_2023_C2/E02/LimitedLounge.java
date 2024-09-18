package Parcial1_2023_C2.E02;

public class LimitedLounge extends Lounge {
    private final int capacity;

    public LimitedLounge(String name, LoungeCentral central, int capacity) {
        super(name, central);
        this.capacity = capacity;
    }

    @Override
    public void enter(Passenger passenger) {
        if (getPassengers() == capacity) throw new IllegalStateException("Cannot enter lounge");
        super.enter(passenger);
    }

    @Override
    public String toString() {
        return super.toString() + " up to " + capacity + " guests";
    }
}
