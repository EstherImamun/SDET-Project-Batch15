package HomeWork;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String month;
        System.out.println("Please enter your month");
        month=input.nextLine();
        if (month.equals("January")){
            System.out.println("You were born in Winter");
        }else if(month.equals ("February")){
            System.out.println("You were born in Winter");
        }else if(month.equals("March")){
            System.out.println("You were born in Spring");
        }else if(month.equals("April")){
            System.out.println("You were born in Spring");
        }else if(month.equals("May")){
            System.out.println("You were born in Spring");
        }else if(month.equals("June")){
            System.out.println("You were born in Summer");
        }else if(month.equals("July")){
            System.out.println("You were born in Summer");
        }else if(month.equals("August")){
            System.out.println("You were born in Summer");
        }else if(month.equals("September")){
            System.out.println("You were born in Autumn");
        }else if(month.equals("October")){
            System.out.println("You were born in Autumn");
        }else if(month.equals("November")){
            System.out.println("You were born in Autumn");
        }else if(month.equals("December")){
            System.out.println("You were born in winter");
        }
       input.close();
    }
}
