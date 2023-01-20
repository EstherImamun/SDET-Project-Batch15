package class11;

public class Example1 {
    public static void main(String[] args){


        int[][] matrix = {{10, 20, 30},
                          {45, 55, 66},
                        {30, 40, 20, 10, 25},
        };
       // foreach loop to print all the numbers from a 2D array

        for(int[] arr: matrix){
            for (int number: arr) {
                System.out.print(number+" ");
            }
            System.out.println();

            }
        }

            }









