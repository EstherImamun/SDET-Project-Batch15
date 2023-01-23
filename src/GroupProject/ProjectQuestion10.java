package GroupProject;

public class ProjectQuestion10 {
    public static void main(String[] args) {
        int[] number={6,8,2,9,7};

        int largest=0;
        int secondL=0;

        for (int i = 0; i < number.length ; i++) {
       if(largest<number[i]){
           secondL=largest;
           largest = number[i];
           System.out.println();

       } else if (number[i] > secondL && number[i]!=largest) {
           secondL=number[i];
       }
            System.out.println("The second largest value of the array is "+secondL);
        }
    }
}
