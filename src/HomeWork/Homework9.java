package HomeWork;

import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 2 numbers and operator");
        int number1,number2;
        number1=input.nextInt();
        number2=input.nextInt();
        char operator=input.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println("The result is "+number1+number2);
                break;
            case '*':
                System.out.println("The result is "+number1*number2);
                break;
            case '/':
                System.out.println("The result is "+number1/number2);
                break;
            case '-':
                System.out.println("The result is "+(number1-number2));
        }
    }
}
