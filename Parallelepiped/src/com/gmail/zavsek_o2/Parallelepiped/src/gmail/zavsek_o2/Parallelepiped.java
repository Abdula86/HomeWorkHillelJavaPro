package gmail.zavsek_o2;

public class Parallelepiped {
    public static void main(String[] args) {
        double width = 7.0;
        double height = 9.0;
        double lenght = 14.0;

        double volume = width * height * lenght;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        double length = 4 * ( width + height + lenght);

        System.out.println("Сумарна довжина всіх сторін = " + length);
    }
}
