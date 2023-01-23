package GroupProject;

public class ProjectQuestion5 {
    public static void main(String[] args) {
       /* int[][] numbers = {{46, 5, 70, 8},
                           {1, 20, 30, 9},
                            {43, 3, 55, 2},
        };
        int Sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0 && numbers[i][j]%2!=0) {
                    System.out.print(numbers[i][j]);
                }System.out.println();

                System.out.println(numbers[i][j]);
                    Sum = Sum + numbers[i][j];
                System.out.println(Sum);
            }

            }*/

        int[][] numbers1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
      int Sum1=0;
      int Sum2=0;
      int TotalSum=0;
        for(int i = 0; i < numbers1.length; i++) {
            for(int j = 0; j < numbers1[i].length; j++) {
                if(numbers1[i][j] % 2 == 0) {
                    System.out.println(numbers1[i][j] + " is even "+"");
                    Sum1=Sum1+numbers1[i][j];
                } else if(numbers1[i][j]%2==1){
                    System.out.print(numbers1[i][j]+" is odd "+"");
                    Sum2=Sum2+numbers1[j][j];
                }
                System.out.println();
            }   TotalSum=Sum1+Sum2;

        }System.out.println("The Total Sum is even and odd numbers is "+TotalSum);
    }
}

