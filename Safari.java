package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litresNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();  // "Saturday" и "Sunday"

        double priceGas = litresNeeded*2.10;
        double totalWithExcur =priceGas+100;
        if (dayOfWeek.equals("Saturday")){
            totalWithExcur=totalWithExcur*0.90;
        } else if (dayOfWeek.equals("Sunday")){
            totalWithExcur=totalWithExcur*0.80;
        }

        if (budget>=totalWithExcur){
            System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(budget-totalWithExcur));
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget-totalWithExcur));
        }

    }
}
