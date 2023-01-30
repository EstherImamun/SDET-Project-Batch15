package class15;

public class MPractice4 {
    int number(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.number(12,13));
    }
}