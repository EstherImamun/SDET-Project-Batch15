package class11;

public class Homework2DArrays4 {
    public static void main(String[] args) {

        int[][] numbers = {{10, 20, 30},
                {11, 22, 35},
                {72, 41, 50},
        };
        int Sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                Sum = Sum + numbers[i][j];
                System.out.println(Sum);
            }
        }
    }
}