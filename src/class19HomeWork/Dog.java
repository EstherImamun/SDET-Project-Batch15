package class19HomeWork;

public class Dog {

    String name;
    String breed;
    void bark(){
        System.out.println("Grandparent parent Dog Barks");
    }
}
class DogChild extends Dog{
    String name;
    String colour;
    double weight;
    void wagtail(){
        System.out.println("DogChild is wagging it's tail");
    }
}
class DogGrandChild extends DogChild{
    String name;
    int price;
    boolean attitude;
    void sleep(){
        System.out.println("DogGrandChild is sleeping zzzzzZZZZZzzzz...");
    }

    public static void main(String[] args) {
        DogGrandChild dogGC=new DogGrandChild();
        dogGC.name="Candy";
        dogGC.colour="Black and Brown";
        dogGC.weight=24.7;
        dogGC.price=2000;
        dogGC.attitude=true;
        dogGC.wagtail();
        dogGC.sleep();

        System.out.println("----------------------------------");

        DogChild dogC=new DogChild();
        dogC.name="Jeremy";
        dogC.breed="Rottweiler";
        dogC.colour="Black and Brown";
        dogC.weight=32.5;
        dogC.bark();
        dogC.wagtail();

        System.out.println("------------------------------------");


    }
}
