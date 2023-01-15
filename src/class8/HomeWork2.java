package class8;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        /*String creditcard;
       /* for(int i=1;i<=10;i++){
            do {
                System.out.println("Would you like to apply for a credit card ?");
                creditCard = input.nextLine();

            }while(creditCard.equalsIgnoreCase("no"));
        }creditCard="yes";*/

        System.out.println("*******************************");

        System.out.println("Would you like to have a credit card");

        for(int a=0;a<=10;a++){
            boolean credit=input.nextBoolean();
            if(!credit){
                System.out.println("Would you like to have a credit card ?");
                continue;
            }else if(credit){
                System.out.println("You already have a credit card");
                break;
            }
        }
        }
    }

