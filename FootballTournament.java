package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int countWin = 0;
        int countDraw = 0;
        int countLose = 0;
        int points = 0;
        int countTotal = 0;
        int sumTotalPoints = 0;
        int sumTotalWin = 0;
        int sumTotalDraw = 0;

        for (int i = 1; i <= games; i++) {
            String symbol = scanner.nextLine();  // 'W', 'D' и 'L'
            if (symbol.equals("W")) {
                points = 3;
                sumTotalWin += points;
                countWin++;
                countTotal++;
            } else if (symbol.equals("D")) {
                points = 1;
                sumTotalDraw += points;
                countDraw++;
                countTotal++;
            } else if (symbol.equals("L")) {
                //points = 0;
                countLose++;
                countTotal++;

            }
            sumTotalPoints = sumTotalWin + sumTotalDraw;
        }
        if (games == 0) {
            System.out.printf("%s hasn't played any games during this season.%n", name);
        }
        if (games >= 1) {
            System.out.printf("%s has won %d points during this season.%n", name, sumTotalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", countWin);
            System.out.printf("## D: %d%n", countDraw);
            System.out.printf("## L: %d%n", countLose);
            double winRate = (double) countWin / games * 100;
            System.out.printf("Win rate: %.2f%%", winRate);
        }
    }
}
