package GroupProject;

public class ProjectQuestion4 {
    public static void main(String[] args) {
        int[][] numbers = {{12, 2, 4, 7},
                {50, 30, 15, 13},
                {6, 9, 40, 22},
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}