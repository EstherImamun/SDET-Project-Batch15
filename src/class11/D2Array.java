package class11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        int[][] matrix={{10,20,30},
                        {45,55,66},
                        {30,40,20,10,25},
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }
        int[] arr=matrix[0];  // getting complete first array from the 2D array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("****************************");
        for (int i = 0; i < matrix[2].length; i++) {
            System.out.println(matrix[2][i]);
        }
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println("*****************************");

        int[] number=matrix[2];
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
