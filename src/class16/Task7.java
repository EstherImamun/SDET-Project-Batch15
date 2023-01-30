package class16;

public class Task7 {

    int array(int[] number){
        int sum=0;
        for(int num:number){
            sum+=num;
        }
        return sum;
   }

    public static void main(String[] args) {
        int[] arr={10,25,35,45};
        Task7 task7=new Task7();

        System.out.println(task7.array(arr));
    }


    }


