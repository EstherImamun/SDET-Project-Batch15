package class21;

public class Task2 {

    static void method(int num1) {
        System.out.println("method with one int parameter");
    }

    static void method(int num1, int num2) {
        System.out.println("method with two int parameters");
    }

    static void method(int num1, double num3, int num2) {
        System.out.println("method with two int and one double parameters");
    }

    public static void main(String[] args) {
        method(15);
        method(5,17);
        method(20,10.5,60);
    }
}
