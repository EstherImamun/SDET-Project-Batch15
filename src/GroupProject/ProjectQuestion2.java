package GroupProject;

import java.util.Scanner;

public class ProjectQuestion2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Countries");
        String[] countries={"Nigeria","Luxembourg","Switzerland","France"};
        String[] capitals={"Abuja","Luxembourg","Bern","Paris"};


        for (int i = 0; i < countries.length; i++) {

            for (int j = 0; j < capitals.length; j++) {
                System.out.println("The Capital of "+countries[j]+" is "+capitals[j]);
                i++;
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------");



        System.out.println("Please enter Countries");
        String[] countries1={"Nigeria","Luxembourg","Switzerland","France"}; // collection of objects of type string
        String[] capitals1=new String[4]; // empty String array , which has ability to hold 4 String type
        capitals1[0]="Abuja";
        capitals1[1]="Luxembourg";
        capitals1[2]="Bern";
        capitals1[3]="Paris"; // 4-1 = 3
        int count =0;
        for(String x: countries1){ // countires1 has 4 entry and one by one the value goes to x
            //count =count ;
            int j = count;
            System.out.print("The capital of "+x);
           // System.out.println("Count is :: "+count);
            for(int i =j ;i<capitals1.length;i++) {
                if(i<=j) {   // 1st  i =0 , j =0 // 2nd i =1 , j =1 // 3rd i =3, j =3
                    System.out.println(" is "+capitals1[i]);
                    break;
                }
            }
            count++;
            /*
             * for(String y: capitals1){ // count ++; System.out.println(" is "+y); //
             * Nigeria and Abuja if(count==1) { } break; }
             */
        }
       /* System.out.println();

        System.out.println("Please enter Countries");
        String[] countries3={"Nigeria","Luxembourg","Switzerland","France"};
        String[] capitals3=new String[4];
        capitals1[0]="Abuja";
        capitals1[1]="Luxembourg";
        capitals1[2]="Bern";
        capitals1[3]="Paris";

        for(String x: countries1){
            for(String y: capitals1){
                System.out.println("The capital of "+x+" is "+y);
            }
            System.out.println();
        }*/


    }
}






