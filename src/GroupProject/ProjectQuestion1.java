package GroupProject;

import java.util.Scanner;

public class ProjectQuestion1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      System.out.println("Please enter values");
        int[] values={10,45,15,20};
int Sum=0;
        for (int i = 0; i <values.length; i++) {
            System.out.println(values[i]);
          Sum=Sum+values[i];
        }
        System.out.println();

        System.out.println("Please calculate the sum of all stores elements in the array");


        System.out.println(Sum);


    }
}
