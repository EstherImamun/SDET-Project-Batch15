package class28.HomeWork;

import java.util.ArrayList;

public class Homework3 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("The");
        words.add("Make");
        words.add("Country");
        words.add("Laptop");
        words.add("Treasure");

        words.removeIf(w -> w.endsWith("e"));

        System.out.println(words);

    }
}
