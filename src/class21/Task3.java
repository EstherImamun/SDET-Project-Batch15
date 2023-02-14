package class21;

public class Task3 {

    private void method(String word1) {
        System.out.println("method with one String parameter");
    }

    private void method(String word1, String word2) {
        System.out.println("method with String parameters");
    }

    private void method(int num1, double num3, String word1) {
        System.out.println("method with one int, one double and one String parameters");
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        task3.method("Amazing");
        task3.method("Amazing","Beautiful");
        task3.method(55,10.3,"Amazing");
    }

}
