package HomeWork;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three numbers");

        double number1,number2,number3;
        number1=input.nextDouble();
        number2=input.nextDouble();
        number3=input.nextDouble();
        if(number1>number2&&number1>number3){
            System.out.println("The largest value is " +number1);
        }else if(number2>number1&&number2>number3){
            System.out.println("The largest number is "+number2);
        }else if(number3>number1&&number3>number2){
            System.out.println("The largest number is "+number3);
        }

    }
}
