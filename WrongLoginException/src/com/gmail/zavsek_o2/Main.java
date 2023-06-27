package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int errorCount = 0;

        try {
            while (errorCount < 3) {
                System.out.print("Введите логин: ");
                String login = scanner.nextLine();

                System.out.print("Введите пароль: ");
                String password = scanner.nextLine();

                System.out.print("Подтвердите пароль: ");
                String confirmPassword = scanner.nextLine();

                try {
                    User user = new User(login, password, confirmPassword);
                    System.out.println("Пользователь успешно создан!");
                    break;
                } catch (WrongLoginException | WrongPasswordException e) {
                    errorCount++;
                    System.out.println("Ошибка: " + e.getMessage());
                    System.out.println("Пожалуйста попробуйте еще раз.");
                }
            }
        } finally {
            scanner.close();
            System.out.println("Благодарим вас за использование нашего сервиса.");
        }
    }
}
