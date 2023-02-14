package class22;

public class Animal {
    String name;
    String colour;
    int age;
    double weight;
    void speak(){
        System.out.println("Animals can speak");
    }
    void eat(){
        System.out.println("All the animals eat");
    }

}
class Cat extends Animal{
    //we are overriding speak method in Cat class
    void speak(){
        //super.speak();
        System.out.println("Meow Meow.....");
    }
    void printName(){
        System.out.println(name);
    }

}
class Dog extends Animal{


}
class Tester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
    }
}
