package class16;

public class Homework3 {


    private static String nameOfP(String name) {
             name=name.replaceAll("[^AaEeIiOoUu]","");
             return name;
        }

    public static void main(String[] args) {
        System.out.println(nameOfP("Understanding"));


    }




    }
