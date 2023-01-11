package HomeWork;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your country");
        String country=input.nextLine();

        switch (country){
            case"Luxembourg":
                System.out.println("Luxembourgish");
                break;
            case"Nigeria":
                System.out.println("English");
                break;
            case"France":
                System.out.println("French");
                break;
            case"Switzerland":
                System.out.println("German");
                break;
            case"Greece":
                System.out.println("Greek");
                break;
            default:
                System.out.println("Wrong Country");
        }
        input.close();
    }
}
