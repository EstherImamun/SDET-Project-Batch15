package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);

        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for (String s:allKeys
             ) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------------------");

      /*  allKeys.removeIf(x-> x.length()>7);// My method
        System.out.println(allKeys);
        System.out.println("-----------------------------------------------");

       */

        //Delete all the entries from the map for which the size of key is greater than 7
        allKeys.removeIf(x->x.length()>7);//Teacher's method
        System.out.println(allKeys);
        System.out.println(makeup);
    }
}
