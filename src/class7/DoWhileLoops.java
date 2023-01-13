package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       /* int number;
        do{
            System.out.println("Please enter a number");
             number=input.nextInt();
        }while(number!=5);*/



        int number=1;

        while(number!=5){
            System.out.println("Please enter a number");
            number=input.nextInt();
        }



    }
}
