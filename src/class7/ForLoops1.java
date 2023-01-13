package class7;

public class ForLoops1 {
    public static void main(String[] args) {

        // Class Task: create a Loop to print odd numbers from 1 to 20

        for (int b = 1; b < 20; b += 2) {  //First Example
            System.out.println(b);
        }


        System.out.println("************************************");
        for (int b = 1; b < 20; b++) { //Second Example
           if(b%2!=0){ // another way to find out if it's an odd number
               System.out.print(b+" ");
           }

        }

    }
}
