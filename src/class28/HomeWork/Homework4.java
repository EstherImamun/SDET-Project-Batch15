package class28.HomeWork;

import java.util.ArrayList;

public class Homework4 {
    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Wine");
        drinks.add("Cappuccino");
        drinks.add("Sprite");
        drinks.add("Milk");

       // drinks.removeIf(d -> d.equals("a e"));
       // System.out.println(drinks.add("water"));


       for (int i = 0; i < drinks.size(); i++) {
       String d =drinks.get(i);
            if (d.contains("a") || drinks.contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);

    }
}

