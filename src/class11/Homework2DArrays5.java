package class11;

public class Homework2DArrays5 {
    public static void main(String[] args) {
        int[][] numbers={{11,3,4,6},
                         {2,7,8,15},
                         {20,40,17,33}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if(numbers[i][j]%2==0)
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();

        }
    }
}
