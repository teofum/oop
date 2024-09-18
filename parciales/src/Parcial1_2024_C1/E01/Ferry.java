package Parcial1_2024_C1.E01;

public class Ferry {
    private final String name;
    private final FerryCompany company;

    public Ferry(String name, FerryCompany c) {
        this.name = name;
        this.company = c;
    }

    public FerryCompany getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Ferry %s".formatted(name);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ferry f)) return false;
        return name.equals(f.name) && company.equals(f.company);
    }
}
