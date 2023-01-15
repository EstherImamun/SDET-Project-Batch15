package class8;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What would you like to buy ?");
        String product=input.nextLine();
        System.out.println("What's the price?");
        double price=input.nextDouble();

        double amount=0;
        double a=655.00;
        double b=473.50;
        double c =150.90;

        switch(product){

            case "furniture":
                System.out.println("you need to pay $655.00");
                 amount=input.nextDouble();
                if(amount<a){
                    amount-=a;
                    System.out.println("You need to pay the balance");
                }else{
                    amount=a;
                    System.out.println("you have paid the full price");
                }
                break;
            case "HandBag":
                System.out.println("You need to pay $473.50");
                double amount1=input.nextDouble();
                if(amount1<b){
                    amount1+=b;
                    System.out.println("You need to pay the full price");
                }else{
                    amount1-=b;
                    System.out.println("You are getting a refund");
                }break;
            default:System.out.println("We do not have the product");
        }

    }
}
