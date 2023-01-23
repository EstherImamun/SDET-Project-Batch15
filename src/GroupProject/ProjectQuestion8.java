package GroupProject;

public class ProjectQuestion8 {
    public static void main(String[] args) {


        int count = 7, box1 = 0, box2 = 1;
        System.out.print("Fibonacci Series of " + count + "numbers:");

        for (int i = 1; i <=count; i++) {
            System.out.println(box1+" ");
            int Sum=box1+box2;
            box1=box2;
            box2=Sum;
        }
    }
}