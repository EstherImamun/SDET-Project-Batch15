package class16;

import java.util.Scanner;

public class Person {
    private double bankBalance=1250000;
    String address="Street 123";
   public String name="Jon Snow";

   void printPhonePassword(){
       System.out.println("pass123");
   }

   public void printTikTokAccount(){
       System.out.println("user123");
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.next();
        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);
    }
}
