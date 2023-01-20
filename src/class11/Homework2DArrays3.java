package class11;

import java.util.Arrays;

public class Homework2DArrays3 {
    public static void main(String[] args) {
        String[][] Groceries={{"Veggies","Fruits","Dairy","Sweets"}};

        for (int i = 0; i < Groceries[0].length; i++) {
            System.out.println(Groceries[0][i]);
        }
        System.out.println();

        for (String[] items:Groceries){
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }

        }


    }
}
