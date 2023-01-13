package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        int number = 15;
        while (condition) {
            System.out.println("Please enter a Number between 10 and 20");
            int userInput = input.nextInt();
            if (userInput > number) {
                System.out.println("Your entered number is greater");
            }else if(userInput<number){
                System.out.println("You entered a smaller number");
            }else{
                System.out.println("You won!!!!");
                condition=false;
            }
        }
    }
}