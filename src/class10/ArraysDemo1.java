package class10;

public class ArraysDemo1 {
    public static void main(String[] args) {
      int[] arr={10,20,30,40,50};
        System.out.println(arr[4]);

        //Can we print two numbers from an array?
        System.out.println(arr[1]+" "+arr[4]);

        // print all the elements from this array using a loop

      for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
      }

      System.out.println("******************************************************************$");
      //Enhanced foreach for loop
        // Whenever possible use below loop
      for(int number:arr){
          System.out.println(number);
      }



    }
}
