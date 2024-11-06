package Parcial2_2023_C1.E02;

public class AddressBookGroup implements Comparable<AddressBookGroup> {
    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof AddressBookGroup group) {
            return name.equals(group.name);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(AddressBookGroup other) {
        return name.compareTo(other.name);
    }
}
