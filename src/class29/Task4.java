package class29;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an ArrayList of drinks. if any drink has letter "a" or "e" replace it with water.
         */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Vodka");
        drinks.add("Juice");
        drinks.add("Beer");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water");//replacing
            }
        }
        System.out.println(drinks);
    }
}
