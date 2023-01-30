package class15;

public class MPractice3 {
    //create a method that takes an array if int sum all the elements from the array and return the sum

    int arraySum(int[] arr) {
        int sum = 0;
        for (int numbers : arr) {
            sum+=numbers;
            System.out.println();
        }
        return sum;
    }

}
