package class33.HomeWork;

public class Homework4 {
    public static void main(String[] args) {
        /*
        Create a method checkUserName that will throw a runtime exception. Method should throw an
        exception when entered username is less than 5 characters.

         */
        try {
            checkUserName("Syn");
        }catch (RuntimeException re){
            System.out.println(re);
        }
    }
    public static void checkUserName(String userName){
        if(userName.length()<5){
            throw new RuntimeException("Username must be more than 5 characters");
        }else{
            System.out.println("Username has been accepted!");
        }
    }
}
