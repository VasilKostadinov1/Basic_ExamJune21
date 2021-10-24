package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double total = bitcoin*1168 +chinese*0.15*1.76;
        double totalEUR = total/1.95;
        double finalResult = totalEUR -totalEUR*commission/100;

        System.out.printf("%.2f",finalResult);
    }
}
