package Repaso1_2024_C2.E03;

public class PizzaTester {
    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Pizza(PizzaType.GRILL, PizzaTopping.TOMATO);
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(PizzaType.GRILL, PizzaTopping.TOMATO, PizzaTopping.ONION, PizzaTopping.EXTRA_CHEESE);
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new Pizza(PizzaType.OVEN, PizzaTopping.ONION, PizzaTopping.EXTRA_CHEESE);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
