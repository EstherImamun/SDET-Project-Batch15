package class16;

import class15.HomeWork3;

public class Homework2 {
     static String word;
    public static String reverse(String word){

        StringBuilder st=new StringBuilder(word);
        StringBuilder st1=st.reverse();
        String reversed=st1.toString();
         for (int i = reversed.length()-1; i >=0; i--) {
             return reversed;
         }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(Homework2.reverse("Josh"));
    }

}
