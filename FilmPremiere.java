package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();   //  "John Wick", "Star Wars" или "Jumanji"
        String filmPackage = scanner.nextLine();   // "Drink", "Popcorn" или "Menu"
        int countTickets = Integer.parseInt(scanner.nextLine());
        double pricePer1 = 0;
        double total = 0;

        switch (filmPackage) {
            case "Drink":
                if (projection.equals("John Wick")) {
                    pricePer1 = 12;
                } else if (projection.equals("Star Wars")) {
                    pricePer1 = 18;
                } else if (projection.equals("Jumanji")) {
                    pricePer1 = 9;
                }
                break;
            case "Popcorn":
                if (projection.equals("John Wick")) {
                    pricePer1 = 15;
                } else if (projection.equals("Star Wars")) {
                    pricePer1 = 25;
                } else if (projection.equals("Jumanji")) {
                    pricePer1 = 11;
                }
                break;
            case "Menu":
                if (projection.equals("John Wick")) {
                    pricePer1 = 19;
                } else if (projection.equals("Star Wars")) {
                    pricePer1 = 30;
                } else if (projection.equals("Jumanji")) {
                    pricePer1 = 14;
                }
                break;
        }
        total=pricePer1*countTickets;
        if (projection.equals("Star Wars") && countTickets>=4){
            total=total*0.70;
        }
        if (projection.equals("Jumanji") && countTickets==2){
            total=total*0.85;
        }
        System.out.printf("Your bill is %.2f leva.",total);

    }
}
