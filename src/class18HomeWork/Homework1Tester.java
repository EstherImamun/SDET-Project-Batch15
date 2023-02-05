package class18HomeWork;

public class Homework1Tester {
    public static void main(String[] args) {
      Homework1 homework1=new Homework1();
      homework1.name="Java";
      homework1.type="Constructor";

        System.out.println("----------------------------------");

        Homework1 homework2=new Homework1("IPhone 14 Pro Max",2000);
        homework2.name="IPhone";
        homework2.weight=10.5;


    }
}
