package class9;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        String[] countries={"Nigeria","Luxembourg","Germany","Switzerland"};
        String[] capital=new String[3];
        capital[0]="ABUJA";
        capital[1]="LUXEMBOURG";
        capital[2]="BERLIN";
        capital[3]="BERN";
        for (int i = 0; i < countries.length; i++) {
            if(countries.equals("Nigeria")){
            System.out.println(capital[0]);
            } else if (countries.equals("Luxembourg")) {
                System.out.println(capital[1]);
            }

            System.out.println(countries[i]);
        }
        }
    }

