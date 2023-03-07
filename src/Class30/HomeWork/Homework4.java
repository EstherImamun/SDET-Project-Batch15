package Class30.HomeWork;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Homework4 {
    public static void main(String[] args) {
        Collection<String> objects=new TreeSet<>();
        objects.add("Village");
        objects.add("Planet");
        objects.add("Universe");
        objects.add("Rain");
        //System.out.println(objects);


        for (var uniqueOb:objects
             ) {
            System.out.print(uniqueOb+" ");
        }

    }
}
