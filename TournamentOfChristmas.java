package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);          // 50/100 my solution

        int days = Integer.parseInt(scanner.nextLine());
        double sumDay = 0;
        double sumTotal = 0;
        int countWinDay = 0;
        int countLoseDay = 0;
        int countWinTotal = 0;
        int countLoseTotal = 0;
        boolean isWin = false;


        for (int i = 1; i <= days; i++) {
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String winLose = scanner.nextLine();  // "win" или "lose"
                if (winLose.equals("win")) {
                    sumDay += 20;        // печелите по 20лв. за благотворителност
                    //sumTotal+=20;
                    countWinDay++;
                    countWinTotal++;

                } else if (winLose.equals("lose")) {
                    countLoseDay++;
                    countLoseTotal++;
                }


                sport = scanner.nextLine();
            }
            if (countWinDay > countLoseDay) {   //повече спечелени игри, отколкото загубени
                sumDay = sumDay * 1.10;      //този ден и увеличавате парите от него с 10%.
            }

            countWinDay = 0;     //!!! занулчваме броя4а края на деня
            countLoseDay = 0;     //!!! занулчваме броя4а края на деня
            sumTotal += sumDay;
            sumDay = 0;            //!!! занулчваме броя4а края на деня след като сме увели4или тотала

        }
        if (countWinTotal > countLoseTotal) {
            sumTotal = sumTotal * 1.20;
            isWin = true;
            System.out.printf("You won the tournament! Total raised money: %.2f", sumTotal);
        } else {

            System.out.printf("You lost the tournament! Total raised money: %.2f", sumTotal);
        }


    }
}
