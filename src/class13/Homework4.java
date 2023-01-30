package class13;

public class Homework4 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("This is the sentence i want to reverse");
        StringBuilder st1 = st.reverse();
        String reversed = st1.toString();

        reversed = "This is the sentence i want to reverse";
        String[] reverse1 = reversed.split(" ");
        {
            for (String word : reverse1) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    System.out.print(word.charAt(i));
                }
            }

            // for (String word : reverse1) {  // converting the sentence into an array of words
            // System.out.print(new StringBuilder(word).reverse() + " ");

        }
    }

}
