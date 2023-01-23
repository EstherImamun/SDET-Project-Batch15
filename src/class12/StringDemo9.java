package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jjhgygf 647876554 @#@|||&&]]´´~~";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i)));{
                counter++;
            }
        }
        System.out.println("Total isAlphabet in Str "+counter);


        // Methods to print the spaces --> Character.issSpace()
    }
}
