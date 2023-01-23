package class12;

import java.util.Scanner;

public class StringHomework3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Mom's first name pls ?");
        String momFirstName=input.next();
        System.out.println("Dad's first name pls ?");
        String dadFirstName=input.next();
        System.out.println("Are you expecting a Boy or a Girl?");
        String gender=input.next();
        String boy="DANRY";
        String girl="MAIEL";

        if(momFirstName.equals("Mary") && dadFirstName.equals("Daniel")){
            if(gender.equals("boy")){
                System.out.println("Suggested Baby name is "+boy);
            }
        }else{
            if(momFirstName.equals("Mary") && dadFirstName.equals("Daniel")){
                if(gender.equals("girl")){
                    System.out.println("Suggested Baby name is "+girl);
                }
            }
        }
    }
}
