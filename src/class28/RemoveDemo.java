package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");
        //it does not work in Java 9 and below
        var name="HDhjjlkjd"; // this only works if you're using Java 10
        var c='s';
        var f=12.5;

        // it works from Java 6 to Java 19
        /* Iterator<String> iterator=words.iterator();


        while(iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }
        }*/
       // does not work in Java 7
        words.removeIf(s -> s.endsWith("a"));  // this works if you're using Java 11
        System.out.println(words);

    }
}
