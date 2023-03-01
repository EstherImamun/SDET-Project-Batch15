package class28.HomeWork;

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>(5);
        names.add("Joshua");
        names.add("Ruth");
        names.add("Ava");
        names.add("Charles");
        names.add("Nichole");
        System.out.println(names.isEmpty());
        System.out.println(names.get(1).equals("Ruth"));

        System.out.println(names.size());

        System.out.println(names);


    }

}
