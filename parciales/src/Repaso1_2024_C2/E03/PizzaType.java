package Repaso1_2024_C2.E03;

public enum PizzaType {
    OVEN("Pizza al horno", 100),
    GRILL("Pizza a la parrilla", 150);

    private final String name;
    private final double price;

    PizzaType(String name, double price) {
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
