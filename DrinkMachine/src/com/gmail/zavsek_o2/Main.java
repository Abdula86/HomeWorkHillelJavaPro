package com.gmail.zavsek_o2;

public class Main {
    public static void main(String[] args) {
        String drinkChoice1 = "tea";
        String drinkChoice2 = "coffee";

        drinkChoice1 = drinkChoice1.toUpperCase();
        DrinksMachine drink1 = DrinksMachine.valueOf(drinkChoice1);
        Drinks.makeDrink(drink1);

        drinkChoice2 = drinkChoice2.toUpperCase();
        DrinksMachine drink2 = DrinksMachine.valueOf(drinkChoice2);
        Drinks.makeDrink(drink2);

        int totalDrinksCount = Drinks.getTotalDrinksCount();
        double totalAmount = Drinks.getTotalAmount();

        System.out.println("Total drinks count: " + totalDrinksCount);
        System.out.println("Total amount to pay: " + totalAmount + " грн");
    }
}
