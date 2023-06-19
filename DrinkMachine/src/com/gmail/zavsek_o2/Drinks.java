package com.gmail.zavsek_o2;

class Drinks {
    private static final double COFFEE_PRICE = 18;
    private static final double TEA_PRICE = 10;
    private static final double LEMONADE_PRICE = 20;
    private static final double MOJITO_PRICE = 35;
    private static final double MINERAL_WATER_PRICE = 15;
    private static final double COCA_COLA_PRICE = 30;

    private static int totalDrinksCount = 0;
    private static double totalAmount = 0.0;

    public static void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                System.out.println("Приготовление кофе");
                totalDrinksCount++;
                totalAmount += COFFEE_PRICE;
                break;
            case TEA:
                System.out.println("Приготовление чая");
                totalDrinksCount++;
                totalAmount += TEA_PRICE;
                break;
            case LEMONADE:
                System.out.println("Приготовление Лимонада");
                totalDrinksCount++;
                totalAmount += LEMONADE_PRICE;
                break;
            case MOJITO:
                System.out.println("Приготовление Мохито");
                totalDrinksCount++;
                totalAmount += MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                System.out.println("Раздача минеральной воды");
                totalDrinksCount++;
                totalAmount += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                System.out.println("Раздача Кока-Колы");
                totalDrinksCount++;
                totalAmount += COCA_COLA_PRICE;
                break;
            default:
                System.out.println("Неверный выбор напитка");
                break;
        }
    }

    public static int getTotalDrinksCount() {
        return totalDrinksCount;
    }

    public static double getTotalAmount() {
        return totalAmount;
    }
}

