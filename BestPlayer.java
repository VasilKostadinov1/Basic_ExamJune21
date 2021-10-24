package BASIC.Additional_Problems_MIX.ExamPrepJune21;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int sum =0;
        int max = Integer.MIN_VALUE;
        String maxName="";
        boolean isHattrick =false;

        while (!name.equals("END")){
            int count = Integer.parseInt(scanner.nextLine());  // scanner.nextline()
            //sum+=count;
            if (count>max){
                max=count;
                maxName=name;
            }
            if (count>=3){          // Хет-трик е, когато футболистът е вкарал 3 или повече гола.
                isHattrick=true;
            }
            if(count>=10){           // Ако футболистът е вкарал 10 или повече гола, програмата трябва да спре.
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", maxName);
        if (isHattrick ){                                                             // if max >=3
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        }else {
            System.out.printf("He has scored %d goals.",max);
        }


    }
}
