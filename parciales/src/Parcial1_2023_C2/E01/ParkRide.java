package Parcial1_2023_C2.E01;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot> {
    private final String name;
    private final LocalTime openingTime;
    private LocalTime closingTime;
    private final long slotLength;

    public ParkRide(String name, LocalTime openingTime, LocalTime closingTime, long slotLength) {
        if (closingTime.isBefore(openingTime))
            throw new IllegalArgumentException("Closing time cannot be before opening time");
        if (slotLength <= 0) throw new IllegalArgumentException("Slot length must be a positive integer");

        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.slotLength = slotLength;
    }

    public void setCloseTime(LocalTime closeTime) {
        if (closeTime.isBefore(openingTime))
            throw new IllegalArgumentException("Closing time cannot be before opening time");
        this.closingTime = closeTime;
    }

    @Override
    public Iterator<ParkSlot> iterator() {
        return new Iterator<ParkSlot>() {
            private LocalTime time = openingTime;
            private final LocalTime closingTime = ParkRide.this.closingTime;

            @Override
            public boolean hasNext() {
                return time.isBefore(closingTime);
            }

            @Override
            public ParkSlot next() {
                if (!hasNext()) throw new NoSuchElementException();
                ParkSlot slot = new ParkSlot(name, time);
                time = time.plusMinutes(slotLength);
                return slot;
            }
        };
    }
}
