package class16;

public class Students {
    String name;
    String ID;
    static int numberOS;


    public static void main(String[] args) {
        Students Tom=new Students();
        Tom.name="Tom";
        Tom.ID="568";
        Tom.numberOS++;

        Students Esther=new Students();
        Esther.name="Esther";
        Esther.ID="1234";
        Esther.numberOS++;
        System.out.println(Students.numberOS);

        }
    }

