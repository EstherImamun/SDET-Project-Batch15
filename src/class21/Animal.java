package class21;

public class Animal {
    String name;
    String colour="Black";

}
class Cat extends Animal{
    String colour="White";
    int age=10;
    double weight;

    void printColour(){
        String colour="Blue";
        System.out.println(colour);
        System.out.println(this.colour);
        System.out.println(super.colour);
    }
}

