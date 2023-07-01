package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();

        while (true) {
            System.out.println("Выберите напиток (1 - Кофе, 2 - Чай, 3 - Лимонад, 4 - Мохито, 5 - Минеральная вода, 6 - Кока-Кола):");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= DrinksMachine.values().length) {
                DrinksMachine desiredDrink = DrinksMachine.values()[choice - 1];
                drinks.makeDrink(desiredDrink);
            } else {
                System.out.println("Не знаю как приготовить напиток");
            }

            System.out.println("Заказано " + drinks.getQuantity() + " напитков");
            System.out.println("Общая сумма: " + drinks.getTotalPrice() + " грн");

            System.out.println("Желаете заказать еще один напиток? (y/n)");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.println("Вам необходимо заплатить: " + drinks.getTotalPrice() + " грн");
    }
}



