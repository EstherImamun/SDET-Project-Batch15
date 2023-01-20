package class9;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        String[] countries = {"Nigeria", "Luxembourg", "Germany", "Switzerland", "Austria"};
        String[] capitals =new String[5];
        capitals[0]="Abuja";
        capitals[1]="Luxembourg";
        capitals[2]="Berlin";
        capitals[3]="Bern";
        capitals[4]="Vienna";
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < capitals.length; j++) {
                System.out.println("The capital if "+countries[i]+ " is " + capitals[j]);
                i++;
            }
        }
    }
}

