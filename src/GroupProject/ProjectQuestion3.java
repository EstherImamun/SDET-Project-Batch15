package GroupProject;

public class ProjectQuestion3 {
    public static void main(String[] args) {
        int[][] values={{14,20,55},
                       {7,90,45,11},
                       {2,8,10,}
        };
       int Sum=0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]+" ");
                Sum=Sum+values[i][j];
            }System.out.println();

            System.out.println(Sum);

            System.out.println();

        }
    }
}
