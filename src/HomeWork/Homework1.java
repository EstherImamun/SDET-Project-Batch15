package HomeWork;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int height;
        System.out.println("Please enter height in inches");
        height=input.nextInt();

        if(height<60){
            System.out.println("Short");
        }else if(height>=60 && height<=72){
            System.out.println("Medium");
        }else if(height>72){
            System.out.println("Tall");
        }


    }
}
