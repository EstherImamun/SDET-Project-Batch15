package class14;

public class Task4 {
    public static void main(String[] args) {
        // 4) How would you reverse a String word by word? for example
        // input=>This is sentence I want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

       StringBuilder st=new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
        String str=st.toString();// converting a StringBuilder to a String so that we can call all methods from String


        String str2 = "This is sentence i want to reverse";
        String[] arr = str.split(" ");

       /* for (String word : arr) {  // converting the sentence into an array of words
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }*/

       for (String word : arr) {  // converting the sentence into an array of words
            StringBuilder st1 = new StringBuilder(word);
            st.reverse();
            System.out.print(st);

            System.out.print(" ");


           /* for (String word : arr) {  // converting the sentence into an array of words
                System.out.print(new StringBuilder(word).reverse()+" ");*/







           /* String word = "This";
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }*/


        }


    }
}