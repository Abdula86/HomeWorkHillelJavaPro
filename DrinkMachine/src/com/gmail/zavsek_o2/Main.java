package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();

        while (true) {
            System.out.println("Выберите напиток (1 - Кофе, 2 - Чай, 3 - Лимонад, 4 - Махито, 5 - Минералка, 6 - Кока-Кола):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drinks.makeDrink(DrinksMachine.КОФЕ);
                    break;
                case 2:
                    drinks.makeDrink(DrinksMachine.ЧАЙ);
                    break;
                case 3:
                    drinks.makeDrink(DrinksMachine.ЛИМОНАД);
                    break;
                case 4:
                    drinks.makeDrink(DrinksMachine.МАХИТО);
                    break;
                case 5:
                    drinks.makeDrink(DrinksMachine.МИНЕРАЛКА);
                    break;
                case 6:
                    drinks.makeDrink(DrinksMachine.КОКА_КОЛА);
                    break;
                default:
                    System.out.println("Не знаю как приготовить напиток");
                    break;
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

