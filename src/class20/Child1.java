package class20;

public class Child1 extends Parent {
    public static void main(String[] args) {

        Child1 c1=new Child1();
        c1.hello();
        Parent.bye(); //accessing static method in a static way by using class name
        Child1.bye();//accessing static method from the parent class using Child class name
        c1.bye();//can be accessed but not the right way

        //c1.money(); 'money()' has private access in 'class20.Parent'

        c1.name="TIM";
        Parent.lastName="DONNY";
        Child1.lastName="DONNY";
    }
}
