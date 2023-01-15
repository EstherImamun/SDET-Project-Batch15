package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {// my first classwork
        /*int[] numbers = new int[5];
        int sum = 0;
        numbers[0] = 45;
        numbers[1] = 44;
        numbers[2] = 33;
        numbers[3] = 20;
        numbers[4] = 10;
        //numbers[5]=50; error out of bounds
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0)
                sum = sum + numbers[i];
        }
        System.out.println(sum);*/


        System.out.println("********************************");

        int sum1=0;  // my second classwork
        int[] numbers1={10,20,30,4,5,6,7,80};
        for (int i = 0; i < numbers1.length; i++) {
            if(numbers1[i]%2==0){
                sum1=sum1+numbers1[i];
            }System.out.println(numbers1[i]);
        }


      /*  int [] numbers2= new int[5];// Teachers first classwork
        numbers[0]=45;
        numbers[1]=44;
        numbers[2]=33;
        numbers[3]=20;
        numbers[4]=10;
        // numbers[5]=50; error out of bounds

        int sum=0;
        for (int i = 0; i < numbers2.length; i++) {
            if(i%2==0){
                sum=sum+numbers2[i];
            }

        }
        System.out.println(sum);

    }*/

        // create an array and store 10,20,30,4,5,6,7,80
        //add all the element which are multiple of 2
        int[] arr= {10,20,30,4,5,6,7,80};    // Teachers second classwork
        int sum=0;
        for (int i = 0; i <arr.length; i++) {

            if (arr[i] % 2 ==0){
                sum = sum +arr[i];
            }
        }

        System.out.println(sum);

    }
}