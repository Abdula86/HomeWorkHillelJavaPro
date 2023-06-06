package com.gmail.zavsek_o2;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToRandom = random.nextInt(11);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Приветствую в игре 'Угадай число'!");
        System.out.println("Компьюетр загадал число от 0 до 10.");
        System.out.println("У вас есть 3 попытки, чтобы отгадать число.");

        boolean win = false;

        while (numberOfTries < 3) {
            System.out.println("Попытка#" + (numberOfTries + 1) + ": ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToRandom) {
                System.out.println("Молодец! Вы выиграли!");
                win = true;
                break;
            }
        }
        if (!win) {
            System.out.println("Вы проиграли! Компьютер загадал число " + numberToRandom + ".");
        }
        input.close();
    }
}