package class29;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task1 {
    /*
    1. Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your ArrayList and print all values from that
     */

    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Anush");
        names.add("Manshu");
        names.add("Kanshu");
        names.add("Panshu");
        names.add("DananShu");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Anush"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
