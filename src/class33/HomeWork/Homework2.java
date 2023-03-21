package class33.HomeWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Homework2 {
    public static void main(String[] args) {
        /*
        2) Create a static method that will return a List of Exceptions.
         Inside your method create objects of 4 exception classes using try and catch blocks and store them
      inside your list.Call your method inside main and print name and details of all Exception objects.
         */

      fourExceptions();

    }

    public static List<Exception> fourExceptions()  {

        List<Exception> list = new ArrayList<>();
       try {
           System.out.println(6 / 0);
       }catch (ArithmeticException ae){
           System.out.println(ae);
       }
       try {
           String name = null;
           name.charAt(5);
       }catch (NullPointerException npe){
           System.out.println(npe);
       }
        try {
            double[] values = new double[-7];
            System.out.println(values[3]);
        }catch (NegativeArraySizeException nse){
            System.out.println(nse);
        }
        try {
            FileInputStream fis = new FileInputStream("you");
        }catch (FileNotFoundException fne){
            System.out.println(fne);
        }

       return  fourExceptions();

    }
}