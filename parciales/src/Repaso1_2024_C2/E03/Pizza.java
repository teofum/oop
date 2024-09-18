package Repaso1_2024_C2.E03;

public class Pizza {
    private final PizzaType type;
    private final PizzaTopping[] toppings;

    public Pizza(PizzaType type, PizzaTopping... toppings) {
        this.type = type;
        this.toppings = toppings;
    }

    public double getPrice() {
        double toppingsPrice = 0;
        for (PizzaTopping topping : toppings)
            toppingsPrice += topping.getPrice();

        return type.getPrice() + toppingsPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        for (PizzaTopping topping : toppings)
            sb.append(" con ").append(topping);
        sb.append(": $").append(String.format("%.2f", getPrice()));

        return sb.toString();
    }
}
