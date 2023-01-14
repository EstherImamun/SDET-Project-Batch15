package class7;

import java.util.Scanner;

public class ReviewPracticeforWhileLoops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Are you tired?");
    boolean tired=input.nextBoolean();
      int number;
        System.out.println("Please enter a number");
        number=input.nextInt();

        switch(number){
            case (1):
                System.out.println("Number is "+number);
                break;
            case (2):
                System.out.println("Number is "+number);
                break;
            case (3):
                System.out.println("Number is "+number);
                break;
            default:
                System.out.println("Number unknown");
        }


    }
}
