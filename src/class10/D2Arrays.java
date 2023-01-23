package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // A 2D array which can hold 3 one D arrays
        // Each of a size 3
        String [][] thomsonTrain=new String [3][3];
        String[] cabin0={"Adam","Zafar","Sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

    // in the first [] we specify the address of 1 D array
        System.out.println(thomsonTrain[1][1]);

        System.out.println(thomsonTrain[0]); // this will print (cabin0) on the console

        System.out.println("***************************");


        System.out.println(Arrays.toString(thomsonTrain[0]));// This will print all the values or names in (cabin0)

    }
}
