package class17;

public class Task2 {
    /*
    2. Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */

    String reversedStr(String input){
        StringBuilder st=new StringBuilder();
        st.reverse();
        String revSt=st.toString();
        return revSt;
    }

    //Another shorter example :
    //static method can be called by just writing the name of the class.method name.

    public static String reversedStr1(String input){
        return new StringBuilder().reverse().toString();

    }

    public static void main(String[] args) {
        //if we are within the same class, we don't need the class name as well.
        reversedStr1("Monday");
    }


}
