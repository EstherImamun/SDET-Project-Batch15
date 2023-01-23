package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";   // to print all the letters one by one
        char character=str.charAt(2);
        System.out.println(character);

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        int counter=0;  // This is to increase the count
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){// this is to print a particular letter 'a'
                counter++;
            }
        }
        System.out.println(counter);
    }
}
