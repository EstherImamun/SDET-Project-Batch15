package class15;

public class MthodPracticeTester {
    public static void main(String[] args) {


        MethodPractice mp = new MethodPractice();
        boolean isEven = mp.isEven(15);
        System.out.println(isEven);


        boolean isEven1=mp.isEven(100);
        System.out.println(isEven1);

        boolean isEven3=mp.isEven(12);
        System.out.println(isEven3);

        boolean isEven4=mp.isEven(20);
        System.out.println(isEven4);
    }
}