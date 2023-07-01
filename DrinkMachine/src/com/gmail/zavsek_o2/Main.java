package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();

        while (true) {
            System.out.println("Выберите напиток (1 - Кофе, 2 - Чай, 3 - Лимонад, 4 - Мохито, 5 - Минеральная вода, 6 - Кока-Кола):");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    drinks.makeDrink(DrinksMachine.COFFEE);
                    break;
                case 2:
                    drinks.makeDrink(DrinksMachine.TEA);
                    break;
                case 3:
                    drinks.makeDrink(DrinksMachine.LEMONADE);
                    break;
                case 4:
                    drinks.makeDrink(DrinksMachine.MOJITO);
                    break;
                case 5:
                    drinks.makeDrink(DrinksMachine.MINERAL_WATER);
                    break;
                case 6:
                    drinks.makeDrink(DrinksMachine.COCA_COLA);
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


