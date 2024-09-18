package Parcial1_2024_C1.E01;

import java.time.LocalTime;

public class TimePort extends Port {
    private final LocalTime opening, closing;

    public TimePort(String name, FerryCompany company, int dockCount, LocalTime opening, LocalTime closing) {
        super(name, company, dockCount);

        this.opening = opening;
        this.closing = closing;
    }

    @Override
    public void dock(Ferry ferry, LocalTime time) {
        if (time.isBefore(opening) || time.isAfter(closing)) throw new IllegalArgumentException("Port is closed");

        super.dock(ferry, time);
    }
}
