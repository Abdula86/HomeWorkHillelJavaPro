import java.util.Scanner;

public class TeamFrags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя команды: ");
        String firstTeamName = scanner.nextLine();

        int[] firstTeamScore = new int[5];
        System.out.print("Введите количество фрагов для 1-го игрока: ");
        firstTeamScore[0] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 2-го игрока: ");
        firstTeamScore[1] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 3-го игрока: ");
        firstTeamScore[2] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 4-го игрока: ");
        firstTeamScore[3] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 5-го игрока: ");
        firstTeamScore[4] = scanner.nextInt();

        System.out.println("Введите имя второй команды: ");
        scanner.nextLine();
        String secondTeamName = scanner.nextLine();

        int[] secondTeamScore = new int[5];
        System.out.print("Введите количество фрагов для 1-го игрока: ");
        secondTeamScore[0] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 2-го игрока: ");
        secondTeamScore[1] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 3-го игрока: ");
        secondTeamScore[2] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 4-го игрока: ");
        secondTeamScore[3] = scanner.nextInt();
        System.out.print("Введите количество фрагов для 5-го игрока: ");
        secondTeamScore[4] = scanner.nextInt();

        int firstTeamFrags = 0;
        for (int score : firstTeamScore) {
            firstTeamFrags += score;
        }
        int secondTeamFrags = 0;
        for (int score : secondTeamScore) {
            secondTeamFrags += score;
        }

        double firstTeamAverage = (double) firstTeamFrags / firstTeamScore.length;
        double secondTeamAverage = (double) secondTeamFrags / secondTeamScore.length;

        if (firstTeamFrags > secondTeamFrags) {
            System.out.println("Победила команда " + firstTeamName + ", набрав " + firstTeamFrags + " очков");
            System.out.println("Среднеекоманде количество фрагов в команде " + firstTeamName + ": " + firstTeamAverage);
            System.out.println("Среднее количество фрагов в команде " + secondTeamName + ": " + secondTeamAverage);
        } else if (secondTeamFrags > firstTeamFrags) {
            System.out.println("Победила команда " + secondTeamName + ", набрав " + secondTeamFrags + " очков");
            System.out.println("Среднее количество фрагов в команде " + firstTeamName + ": " + firstTeamAverage);
            System.out.println("Среднее количество фрагов в команде " + secondTeamName + ": " + secondTeamAverage);
        } else {
            System.out.println("Ничья! Обе команды набрали по " + firstTeamFrags + " очков");
            System.out.println("Среднее количество фрагов в команде " + firstTeamName + ": " + secondTeamAverage);
            System.out.println("Среднее количество фрагов в команде "  + secondTeamName + ": " + firstTeamAverage);
        }
    }
}
