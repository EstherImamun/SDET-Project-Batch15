package class9;

public class ArraysDemo {
    public static void main(String[] args) {

       /* String name="Slava";
        String name2="Safi";
        String name3="Jason";
        String name4="Nabi";
        String name5="Anees";


        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);

        for (int i = 0; i <=6; i++) {
            System.out.println(names[i]);

        }*/

        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};
        // write a loop to print all the names from array
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
