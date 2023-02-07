package class20;

public class BaseClass {
    String name="John";

    void hello(){
        System.out.println("Hello method from BaseClass");
    }
}

class Child extends BaseClass{

    String name="Jane";

    void callMe(){
        System.out.println(this.name); //it prints jane but you don't necessarily have to add the (this.) keyword
        //you can just type the instance variable (name) and it will also print the name (Jane)

        System.out.println(super.name);// John
    }

    void hello(){
        System.out.println("Hello methods from Child class");
    }

    void callingParentMethod(){
        hello();
        super.hello();
    }
}
