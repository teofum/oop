package Parcial1_2024_C1.E01;

public class FerryCompany {
    private final String name;

    public FerryCompany(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof FerryCompany c)) return false;
        return name.equals(c.name);
    }
}
