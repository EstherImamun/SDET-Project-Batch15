package Class30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class classTask2 {
    public static void main(String[] args) {
        Map<String,String> countries=new TreeMap<>();
        countries.put("Nigeria","Abuja");
        countries.put("Luxembourg","Luxembourg");
        countries.put("Switzerland","Bern");
        countries.put("Germany","Berlin");
        countries.put("Belgium","Brussels");

      // Set<Entry<String,String>> entrySet=countries.entrySet(); //This is used with Java 8
        var entrySet=countries.entrySet(); // the var keyword is used with Java 10 or newer versions of Java

        for (var entry:entrySet
             ) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        var iterator=countries.entrySet().iterator();

        while(iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
