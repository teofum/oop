package Parcial1_2024_C1.E01;

import java.time.LocalTime;

public class StackTimePort extends TimePort {
    private Ferry lastDockedFerry = null;

    public StackTimePort(String name, FerryCompany company, int dockCount, LocalTime opening, LocalTime closing) {
        super(name, company, dockCount, opening, closing);
    }

    @Override
    public void dock(Ferry ferry, LocalTime time) {
        super.dock(ferry, time);

        lastDockedFerry = ferry;
    }

    @Override
    public void undock(Ferry ferry, LocalTime time) {
        // Reference equality, these must be *the same ferry*, not two identical ones
        if (lastDockedFerry == null || ferry != lastDockedFerry)
            throw new IllegalArgumentException("Can only undock last docked ferry");

        super.undock(ferry, time);
    }
}
