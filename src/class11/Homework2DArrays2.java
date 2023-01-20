package class11;

import java.util.Arrays;

public class Homework2DArrays2 {
    public static void main(String[] args) {
        String[][] cars={{"American","German","Korean","Italian"}
        };

        for(String[] x: cars){
            for (int i = 0; i < x.length; i++) {
                System.out.println(x[i]);
            }
        }
        System.out.println();


        for (int i = 0; i < cars[0].length; i++) {
            System.out.println(cars[0][i]);

        }
        }
    }

