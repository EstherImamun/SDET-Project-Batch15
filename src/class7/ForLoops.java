package class7;

import java.sql.SQLOutput;

public class ForLoops {
    public static void main(String[] args) {
        /*
        print number from 0 to 9
*/
        // The WhileLoop Example
   int number=0;//creating a variable of type int
        while(number<10){  // checks condition if condition is true and execute the code in the body.
            System.out.println(number); // prints the value of the number on console
              number++;                           // it adds One to the variable
        }

        System.out.println("*********************************");

        for(int i=0;i<10;i++) {
            if(i%2==0)
            System.out.println(i);


        }
        }
}
