package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();//This is generic

        names.add("10");

        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

       // No one uses the arrays like this anymore.
        ArrayList name=new ArrayList();//this is non-generic.
        name.add("Ehsan");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky", "Green", "unknown"));
        for(Object j:name){
            ((String)j).trim();
        }
    }
}
