package class16;

public class Task3 {
    void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedstr=st.toString();
        if(str.equals(reversedstr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" Not palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task3=new Task3();
        // String result=task3.isPalindrome("Kaya"); can't assign void methods to variables.
        //System.out.println(task3.isPalindrome("Kaya")); can't use void methods in println
        task3.isPalindrome("Kaya");
    }
}
