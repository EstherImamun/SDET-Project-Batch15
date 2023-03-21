package class33.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
       /* 1) How would handle InputMismatchException? Input Mismatch
        Exception when user enters mismatch value then programmer expected.

        */


        Scanner input = new Scanner(System.in);
        String name;
        boolean valid = true;
        if (valid) {
            System.out.println("Please enter a String");
            try {
                name = input.next();
                valid = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid input! Please enter a String");
            }
        }
    }
}