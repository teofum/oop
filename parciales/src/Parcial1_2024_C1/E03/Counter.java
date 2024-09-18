package Parcial1_2024_C1.E03;

public class Counter {
    private final int number;
    private final String airline;
    private boolean checkingIn = false;

    public Counter(int number, String airline) {
        this.number = number;
        this.airline = airline;
    }

    public void checkIn() {
        checkingIn = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isCheckingIn() {
        return checkingIn;
    }

    public String getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return "Counter %d for %s is %s".formatted(number, airline, checkingIn ? "checking in" : "idle");
    }
}
