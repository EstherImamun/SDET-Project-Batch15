package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* 4) Write a program to ask a user to enter item they want to buy and the price of
        that item. Every time user enters money accumulate the amount and tell the user
         how much is left to pay off. If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
         */

        Scanner input=new Scanner(System.in);
     /* System.out.println("Please enter your items and the price");
      String items=input.nextLine();
      int price=input.nextInt();
        System.out.println("Please pay the amount of $450.00 for the "+items);
        int amount=input.nextInt();

        for (int i = 0; i >2; i++) {
           if(amount<price){
               System.out.println("You need to pay the balance of "+(price-amount));
           }else if(amount>price){
               System.out.println("Here's your balance "+(amount-price));
           }else if(amount==price){
               System.out.println("Here are your Items");
           }
        }
        System.out.println("Thank you for shopping with us!");*/


       /* steps:
        1.ask user for item price and the item name
        2. accumulate the price
        3. tell the user how much total they need to pay
        4. if user give more money, program should return change
        5. Thank you for shopping with us!
       */

       /* double total=0;
        for (int i = 0; i < 3; i++) {
        System.out.println("Please enter your item and it's price ");}
        String itemName=input.next();
        double itemPrice=input.nextDouble();
        total=total+itemPrice;
        System.out.println("This is the total amount that you have to pay "+total);*/


        Scanner scanner = new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the totalPrice amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double chang=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
        }
        System.out.println("Thank you for shopping!");


    }
}
