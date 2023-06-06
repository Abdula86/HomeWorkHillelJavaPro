package com.gmail.zavsek_o2;

public class ChinaDynasty {
    public static void main(String[] args) {
        int liWarriorPerType = 860;
        int liWarriorPerUnit = 13;
        int liArcherPerUnit = 24;
        int liRaiderPerUnit = 46;

        int liTotalWarriorAttack = liWarriorPerType * liWarriorPerUnit;
        int liTotalArcherAttack = liWarriorPerType * liArcherPerUnit;
        int liTotalRiderPerAttack = liWarriorPerType * liRaiderPerUnit;
        int liTotalAttack = liTotalWarriorAttack + liTotalArcherAttack + liTotalRiderPerAttack;

        double minWarriorPerMultiplier = 1.5;
        int minWarriorPerType = (int) (liWarriorPerType * minWarriorPerMultiplier);
        int minWarriorPerUnit = 9;
        int minArcherPerUnit = 35;
        int minRaiderPerUnit = 12;

        int minTotalWarriorAttack = minWarriorPerType * minWarriorPerUnit;
        int minTotalArcherAttack = minWarriorPerType * minArcherPerUnit;
        int minTotalRaiderAttack = minWarriorPerType * minRaiderPerUnit;
        int minTotalAttack = minTotalWarriorAttack + minTotalArcherAttack + minTotalRaiderAttack;

        System.out.println("Загальна атака династії Лі; " + liTotalAttack);
        System.out.println("Загальна атака династії Мінь: " + minTotalAttack);



    }
}