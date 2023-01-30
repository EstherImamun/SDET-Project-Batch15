package class16;

public class Homework3 {


    private static String nameOfP(String name) {
             name=name.replaceAll("[^AaEeIiOoUu]","");
             return name;
        }

    public static void main(String[] args) {
        Homework3 hm=new Homework3();
        System.out.println(hm.nameOfP("Understanding"));


    }




    }
