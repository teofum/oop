package Parcial1_2023_C2.E02;

public class Lounge {
    private final String name;
    private final LoungeCentral central;
    private int passengers = 0;

    public Lounge(String name, LoungeCentral central) {
        this.name = name;
        this.central = central;
    }

    public void enter(Passenger passenger) {
        if (!central.isOpen()) throw new IllegalStateException("Cannot enter lounge");
        passenger.usePass();
        passengers++;
    }

    public void exit() {
        this.exit(1);
    }

    public void exit(int amount) {
        if (amount <= 0) throw new IllegalStateException("Cannot exit lounge");
        if (passengers < amount) throw new IllegalStateException("Lounge is empty");
        passengers -= amount;
    }

    @Override
    public String toString() {
        return name + " has " + passengers + " guests";
    }

    protected int getPassengers() {
        return passengers;
    }
}
