package class24;

public class AnimalTester {
    public static void main(String[] args) {
        //Animal animal=new Animal();
        //animal.speak();
        Animal[] arr={new Dog(),new Cat()};
        for(Animal animal: arr){
            animal.speak();
            animal.sleep();
        }
    }
}
