package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your userName");
        String userName=input.next();
        System.out.println("Please enter your password");
        String passWord=input.next();
        System.out.println("Please confirm your password");
        String confirmPassword=input.next();

        if(userName.isEmpty()||passWord.isEmpty()){
            System.out.println("UserName and passWord cannot be empty ");
        } else if (passWord.length()<8) {
            System.out.println("Password is too short");
        }else if(passWord.contains(userName)){
            System.out.println("Password cannot contain username");
        } else if (!passWord.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }
    }
}
