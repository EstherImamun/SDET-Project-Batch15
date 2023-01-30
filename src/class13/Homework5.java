package class13;

public class Homework5 {
    public static void main(String[] args) {
        boolean palindrome;

        StringBuilder st=new StringBuilder("Chicken");
        StringBuilder st1=st.reverse();
        String reversed=st1.toString();
        String reversed2=reversed;
if(reversed2.equalsIgnoreCase("Chicken")){
    palindrome=true;
}else{
    palindrome=false;
}
System.out.println(palindrome+" ");

    }
}
