package com.gmail.zavsek_o2;

import java.util.HashMap;
import java.util.Map;

class Drinks {
    private static final Map<DrinksMachine, Double> prices = new HashMap<>();

    static {
        prices.put(DrinksMachine.КОФЕ, 15.0);
        prices.put(DrinksMachine.ЧАЙ, 10.0);
        prices.put(DrinksMachine.ЛИМОНАД, 20.0);
        prices.put(DrinksMachine.МАХИТО, 30.0);
        prices.put(DrinksMachine.МИНЕРАЛКА, 15.0);
        prices.put(DrinksMachine.КОКА_КОЛА, 25.0);
    }

    private int quantity;
    private double totalPrice;

    public void makeDrink(DrinksMachine drinksMachine) {
        double price = prices.getOrDefault(drinksMachine, 0.0);
        if (price > 0.0) {
            quantity++;
            totalPrice += price;
            System.out.println("Приготовлен напиток: " + drinksMachine);
        } else {
            System.out.println("Неизвестный напиток: " + drinksMachine);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
