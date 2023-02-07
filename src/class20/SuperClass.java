package class20;

public class SuperClass {
    SuperClass(){
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuperClass{

   // SubClass(){
      // super();// it makes a call to the parent class constructor even when you don't use the super Keyword
               // because compiler makes an automatic connection between SuperClass and SubClass
               //because of the (extends keyword) in Inheritance.
       // System.out.println("I am a child constructor");
   // }

}
