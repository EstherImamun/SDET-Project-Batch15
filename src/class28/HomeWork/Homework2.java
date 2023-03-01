package class28.HomeWork;

import java.util.ArrayList;

public class Homework2 {
    public static void main(String[] args) {

        ArrayList<String>  cars=new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Maserati");
        cars.add("Porche Cayenne");
        cars.add("Bentley");

        for(String c:cars){
            System.out.println(c+" ");
        }
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)+" ");
        }
        System.out.println("----------------------------------------------------");

        int i=0;
        while (i< cars.size()){
            System.out.println(cars.get(i)+" ");
            i++;
        }
    }
}
