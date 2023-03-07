package Class30.HomeWork;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PersonTester {
    public static void main(String[] args) {
        Map<Integer,Person> entryMap=new TreeMap<>();
        entryMap.put(345, new Person("Mark","Lucas",25,80000));
        entryMap.put(134, new Person("Debbie","Charles",22,70000));
        entryMap.put(567, new Person("John","Wolf",25,90000));
        entryMap.put(890, new Person("Jennifer","Thompson",25,100000));

        var entry=entryMap.entrySet();
        System.out.println(entryMap.entrySet());
       // System.out.println(entryMap.keySet()+" "+entryMap.values());
    }
}
