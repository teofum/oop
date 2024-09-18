package Parcial1_2024_C1.E01;

import java.time.LocalTime;

public class Port {
    private final String name;
    private final FerryCompany company;
    private final int dockCount;
    private int dockedFerries = 0;

    public Port(String name, FerryCompany company, int dockCount) {
        this.name = name;
        this.company = company;
        this.dockCount = dockCount;
    }

    public void dock(Ferry ferry, LocalTime time) {
        if (!ferry.getCompany().equals(company)) throw new IllegalArgumentException("Ferry company does not match");

        if (dockedFerries >= dockCount) throw new IllegalStateException("Port is full, cannot dock");
        System.out.println(ferry + " docked at " + toString());
        dockedFerries++;
    }

    public void undock(Ferry ferry, LocalTime time) {
        if (dockedFerries == 0) throw new IllegalStateException("Port is empty, cannot undock");
        System.out.println(ferry + " undocked at " + toString());
        dockedFerries--;
    }

    @Override
    public String toString() {
        return "Port " + name;
    }

    protected int getDockedFerryCount() {
        return dockedFerries;
    }
}
