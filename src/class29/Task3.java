package class29;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of words. Remove every word that ends with "e".
         */

        ArrayList<String> makeup=new ArrayList<>();
        makeup.add("Lipstick");
        makeup.add("Eyeliner");
        makeup.add("Blush");
        makeup.add("Foundation");
        makeup.add("Mascara");

        makeup.removeIf(x-> x.endsWith("e"));
        System.out.println(makeup);
    }
}
