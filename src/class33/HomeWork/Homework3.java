package class33.HomeWork;

public class Homework3 {
    public static void main(String[] args) {
       /* 3) Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
        */
        try {
            checkAge(30);
        }catch (RuntimeException re){
            System.out.println(re);
        }
    }


    public static void checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("You are not Eligible");
        } else {
            System.out.println("You are Eligible");
        }
    }
}
