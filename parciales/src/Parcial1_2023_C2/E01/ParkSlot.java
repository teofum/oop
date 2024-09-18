package Parcial1_2023_C2.E01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParkSlot {
    private final String ride;
    private final LocalTime time;

    public ParkSlot(String ride, LocalTime time) {
        this.ride = ride;
        this.time = time;
    }

    @Override
    public String toString() {
        return ride + " <> " + time.format(DateTimeFormatter.ofPattern("HH:mm")) + " Slot";
    }
}
