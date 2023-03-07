package Class30.HomeWork;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Homework5 {
    public static void main(String[] args) {
        Collection<Integer> numbers=new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);
        numbers.add(10);
        numbers.add(50);
        int sum=0;
        for (Integer n:numbers
             ) {
            sum=sum+n;
            System.out.println(sum+" ");
        }
    }
}
