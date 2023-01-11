package class6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*double box1,box2,box3;

        Scanner input=new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        box1=input.nextDouble();
        box2=input.nextDouble();
        box3=input.nextDouble();

        if(box1>box2&&box1>box3){
            System.out.println("The Largest number is "+(box1));
        }else if(box2>box1||box2>box3){
            System.out.println("The Largest number is "+(box2));
        }else{
            System.out.println("The largest number is "+(box3));
        }
        */

        Scanner scan=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Please enter three numbers");
        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();

        if(number1>number2&&number1>number3){
            System.out.println("The largest number is "+number1);
        }else if(number2>number3&&number2>number1){
            System.out.println("The largest number is "+number2);
        }else if(number3>number1&&number3>number2){
            System.out.println("Largest number is "+number3);
        }

    }
}
