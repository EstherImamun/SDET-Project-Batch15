package class15;

public class HomeWork3 {
    void isPalindrome(String word){
       boolean palindrome;
       StringBuilder st=new StringBuilder(word);
       StringBuilder st1=st.reverse();
       String reversed=st1.toString();
       String str=reversed;
       if(str.equals(word)){
           palindrome=true;
           System.out.println(word+" is palindrome");
       }else{
           palindrome=false;
           System.out.println(word+" is not palindrome");
       }

  }

    public static void main(String[] args) {
        HomeWork3 hm=new HomeWork3();
        hm.isPalindrome("Tiger");
    }



}
