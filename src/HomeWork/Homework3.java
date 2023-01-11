package HomeWork;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your quiz, mid term and final scores");
        int quiz = input.nextInt();
        int midterm=input.nextInt();
        int finals=input.nextInt();
        int average=(quiz+midterm+finals)/3;
        if(average>=90){
            System.out.println("grade A");
        }else if(average>=70&&average<90){
            System.out.println("grade B");
        }else if(average>=50&&average<70){
            System.out.println("grade C");
        }else if(average<50){
            System.out.println("grade F");
        }

    }
}
