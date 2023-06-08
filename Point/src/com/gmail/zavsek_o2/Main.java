package com.gmail.zavsek_o2;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println("Координаты 1 точки: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Координаты 2 точки: (" + p2.getX() + ", " + p2.getY() + ")");

        double distance1 = p1.calculateDistance(p2);
        System.out.println("Расстояние между 1 и 2 точками: " + distance1);

        double distance2 = Point.calculateDistance(p1, p2);
        System.out.println("Расстоянгие между 1 и 2 точками (static method): " + distance2);

        boolean isEqual = p1.equals(p2);
        System.out.println("p1 and p2 are equal: " + isEqual);

        Point p3 = p1.clone();
            System.out.println("Clone of p1: " + p3);

        p2.setX(5);
        p2.setY(6);
        System.out.println("Координаты точки 2 после модификации: (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
