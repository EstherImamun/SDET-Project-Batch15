package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kJHGGHDFhgfdj3467764}{#@{$*%))(()"; // Regular expressions are used to identify
       //replaces all upper case letters from Ato Z
        System.out.println(str.replaceAll("[A-Z]", "#"));  // some patterns and then replace them
       // replaces all lower case letters for a to z
        System.out.println(str.replaceAll("[a-z]", "#"));
       // replaces all numbers from 0 to 9
        System.out.println(str.replaceAll("[0-9]", "#"));
        // replaces all upper case letters from A to Z and lower case letters from a to z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
      // replaces all upper case letters from A to Z and lower case letters from a to z and numbers from 0 to 9
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));
       // Does not replace all upper case letters from A to Z and lower case letters from a to z and numbers from 0 to 9
        // instead, it replaces only the special characters.
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        // if nothing is specified in the ("") double quotes, it removes whatever you typed in the regex:
       // it removes whatever you want to replace.
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));
    }
}
