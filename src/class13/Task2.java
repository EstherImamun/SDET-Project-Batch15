package class13;

public class Task2 {
    public static void main(String[] args) {
        // create a String and print it in the reverse order(Sunday->yadnuS)

        String str = "Sunday school"; // This is only limited to reverse Sunday
       /* for (int i = 5; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }*/


       for (int i = str.length() - 1; i >= 0; i--) { // This is to reverse any String value
            System.out.print(str.charAt(i));
        }
    }
}
