package com.gmail.zavsek_o2;

import java.util.HashMap;
import java.util.Map;

class Drinks {
    private static final Map<DrinksMachine, Double> prices = new HashMap<>();

    static {
        prices.put(DrinksMachine.COFFEE, 15.0);
        prices.put(DrinksMachine.TEA, 10.0);
        prices.put(DrinksMachine.LEMONADE, 20.0);
        prices.put(DrinksMachine.MOJITO, 30.0);
        prices.put(DrinksMachine.MINERAL_WATER, 15.0);
        prices.put(DrinksMachine.COCA_COLA, 25.0);
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







