package com.gmail.zavsek_o2;

import java.util.HashMap;
import java.util.Map;

public class Drinks {
    private int quantity;
    private double totalPrice;

    public void makeDrink(DrinksMachine drink) {
        switch (drink) {
            case COFFEE:
                makeCoffee();
                break;
            case TEA:
                makeTea();
                break;
            case LEMONADE:
                makeLemonade();
                break;
            case MOJITO:
                makeMojito();
                break;
            case MINERAL_WATER:
                makeMineralWater();
                break;
            case COCA_COLA:
                makeCocaCola();
                break;
            default:
                System.out.println("Не знаю как приготовить напиток");
                break;
        }
    }

    private void makeCoffee() {
        quantity++;
        totalPrice += 15;
        System.out.println("Кофе приготовлено");
    }

    private void makeTea() {
        quantity++;
        totalPrice += 10;
        System.out.println("Чай приготовлено");
    }

    private void makeLemonade() {
        quantity++;
        totalPrice += 20;
        System.out.println("Лимонад приготовлено");
    }

    private void makeMojito() {
        quantity++;
        totalPrice += 35;
        System.out.println("Мохито приготовлено");
    }

    private void makeMineralWater() {
        quantity++;
        totalPrice += 15;
        System.out.println("Минеральная вода приготовлена");
    }

    private void makeCocaCola() {
        quantity++;
        totalPrice += 35;
        System.out.println("Кока-Кола приготовлена");
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}








