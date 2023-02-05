package class19HomeWork;

public class Cat {
    String name;
    String breed;
    int price;

    static void printF(){
        System.out.println("Cat is bose of the House");
    }
}
class CatChild extends Cat{
    String name;
    String colour;
    double weight;

    void sleeps(){
        this.printF();
    }

    public static void main(String[] args) {
        CatChild catC=new CatChild();
        catC.name="Jaguar";
        catC.breed="Norwegian Forest Cat";
        catC.colour="Grey and White";
        catC.price=4500;
        catC.weight=28.4;
        catC.printF();
    }
}
