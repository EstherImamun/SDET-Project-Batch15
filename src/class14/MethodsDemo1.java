package class14;

public class MethodsDemo1 {
    public static void main(String[] args) { // System.out.println(Arrays.toString(array1)); we use this method to
        int [] array1={10,20,30,45,50};    // print out the values of an array.

        int sum=0;
        for(int number:array1){
            sum+=number;
        }
        System.out.println(sum);

        int [] array2={10,10,10,20,30};
        int sum2=0;
        for(int number:array1){
            sum2+=number;
        }
        System.out.println(sum2);

        int [] array3={10,10,15,20,30};
        int sum3=0;
        for(int number:array1) {
            sum3 += number;
        }
        System.out.println(sum3);




    }
}
