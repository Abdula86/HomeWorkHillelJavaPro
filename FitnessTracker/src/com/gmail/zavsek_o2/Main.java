package com.gmail.zavsek_o2;

public class Main {
    public static void main(String[] args) {
        FitnessTracker firstUser = new FitnessTracker("Андрей", "Шевченко", "a.shevchennko@gmail.com", "+380671234567", 70, 120, 5000, 15, 6, 1980);
        FitnessTracker secondUser = new FitnessTracker("Сергей", "Ребров", "rebrov@gmail.com", "+380677654321", 75, 110, 8000, 20, 8, 1985);
        FitnessTracker thirdUser = new FitnessTracker("Ирина", "Свитолина", "irina@ukr.net", "+380637778899", 60,120, 10000, 10, 4, 1989);

        firstUser.printAccountInfo();
        secondUser.printAccountInfo();
        thirdUser.printAccountInfo();

        firstUser.getLastName();
        firstUser.setWeight(75);
        firstUser.setBloodPressure(125);
        firstUser.setStepsTaken(6000);

        secondUser.getLastName();
        secondUser.setWeight(70);
        secondUser.setBloodPressure(115);
        secondUser.setStepsTaken(9000);

        firstUser.printAccountInfo();
        secondUser.printAccountInfo();
        thirdUser.printAccountInfo();
    }
}


