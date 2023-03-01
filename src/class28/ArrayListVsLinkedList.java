package class28;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
     // linkedList => 174 ms for One million
        // ArrayList => 762 ms for Hundred thousand

        long startTime=System.currentTimeMillis();
        ArrayList<String> numbers=new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0, "Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}
