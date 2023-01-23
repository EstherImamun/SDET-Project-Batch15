package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Send it to support channel. More java";
        // we can only specify the starting point
        String newStr=str.substring(28);
        System.out.println(newStr);
        // we can only specify the starting point and the ending point
        System.out.println(str.substring(0,27));
    }
}
