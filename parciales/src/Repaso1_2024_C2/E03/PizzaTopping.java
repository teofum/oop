package Repaso1_2024_C2.E03;

public enum PizzaTopping {
    TOMATO("Tomate", 30),
    ONION("Cebolla", 10),
    EXTRA_CHEESE("Extra queso", 20);

    private final String name;
    private final double price;

    PizzaTopping(String name, double price) {
        if (price < 0) throw new IllegalArgumentException("Price must be a positive number");

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
