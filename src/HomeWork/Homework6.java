package HomeWork;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number1,number2,number3;
        System.out.println("Find the largest number");
        number1=input.nextInt();
        number2=input.nextInt();
        number3=input.nextInt();

        if(number1>number2&&number1>number3){
            System.out.println("The largest number is "+number1);
        }
        if(number2>number1&&number2>number3){
                System.out.println("The largest number is "+number2);
            }else if (number3>number1&&number3>number2){
                System.out.println("The largest number is "+number3);
            }
        }
    }

