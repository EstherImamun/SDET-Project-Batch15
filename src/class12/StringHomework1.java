package class12;

import java.util.Scanner;

public class StringHomework1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a String?");
        String string=input.nextLine();
        System.out.println("is String empty?");
        boolean empty=input.nextBoolean();
        int string2=string.length();


        for (int i = 0; i <=string.length(); i++) {
                if(!string.isEmpty() && string2%2==1){
                    System.out.println(string.charAt(2));
                    break;
                }
                System.out.println();
        }


        }


    }
            

