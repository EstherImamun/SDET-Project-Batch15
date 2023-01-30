package class13;

public class Homework6 {
    public static void main(String[] args) {
        String str1="The";
        String str2="Best";
        System.out.println("Before the swap: "+str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After the swap: "+str1+" "+str2);

    }
}
