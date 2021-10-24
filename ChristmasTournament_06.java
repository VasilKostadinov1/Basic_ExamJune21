package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class ChristmasTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfTournament = Integer.parseInt(scanner.nextLine());   //Първоначално се прочита броя дни на турнира
        double charity = 0;       // total charity
        int countAllWin = 0;           // total
        int countAllLoose = 0;

        for (int i = 1; i <= daysOfTournament; i++) {  //Всеки ден ( -> For Cycle) получавате имена на игри
            String command = scanner.nextLine();         // до команда "Finish".
            int win = 0;                // зануляваме дневния броя4
            int loose = 0;              // зануляваме дневния броя4
            double dayCharity = 0;      // зануляваме дневния броя4
            while (!command.equals("Finish")) {

                String sport = command;
                String result = scanner.nextLine();   // win or lose
                switch (result) {
                    case "win":
                        win++;
                        dayCharity += 20;
                        break;
                    case "lose":
                        loose++;
                        break;
                }
                command = scanner.nextLine();
            }
            if (win > loose) {
                dayCharity *= 1.10;
                countAllWin++;
            } else {
                countAllLoose++;
            }
            charity += dayCharity;
        }
        if (countAllWin > countAllLoose) {
            charity *= 1.20;
        }
        if (countAllWin > countAllLoose) {
            System.out.printf("You won the tournament! Total raised money: %.2f", charity);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", charity);
        }


    }
}
