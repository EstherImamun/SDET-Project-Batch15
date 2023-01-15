package class8;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number ");
        int startRange = input.nextInt();
        System.out.println("Please enter second number");
        int endRange = input.nextInt();
        int even = 0;
        int odd = 0;
        if (startRange < endRange) {
            for (int i = startRange; i <= endRange; i++) {
           if(i%2==0){
               even+=i;
           }else{
               odd+=i;
           }
            }
            System.out.println("sum of even numbers "+even);
            System.out.println("sum of odd numbers "+ (odd));
        }
    }
}