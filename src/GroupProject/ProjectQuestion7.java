package GroupProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectQuestion7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int number=35;
        boolean work=false;
        for (int i = 2; i <=number/2 ; ++i) {
            if(number%i==0){
                work=true;
                break;
            }
        }
        if(!work)
            System.out.println(number+" is a prime number");
       else
        System.out.println(number+" is not a prime number");
    }
        }


