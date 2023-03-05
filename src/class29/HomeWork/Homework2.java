package class29.HomeWork;

import java.util.LinkedHashSet;

public class Homework2 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Luxembourg");
        cities.add("Lagos");
        cities.add("Brussels");
        cities.add("London");
        cities.add("Abuja");
        
        cities.removeIf(x-> x.startsWith("A"));
        System.out.println(cities);
    }
}
