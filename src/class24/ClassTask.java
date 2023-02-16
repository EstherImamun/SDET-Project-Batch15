package class24;


public class ClassTask {


}

    class Animal1 {
        /*
        define the speak eat methods and create 3 subclasses and override the speak eat methods
         */
        public void speak() {
            System.out.println("Animal is speaking...");
        }

        public void eat() {
            System.out.println("Animal is eating ....");
        }
    }

    class Dog1 extends Animal1 {
        @Override
        public void speak() {
            System.out.println("The Dog Barks");
        }

        @Override
        public void eat() {
            System.out.println("The Dog is eating...");
        }
    }

    class Cat1 extends Animal1 {
        @Override
        public void speak() {
            System.out.println("The Cat says Meow Meow...");
        }

        @Override
        public void eat() {
            System.out.println("The Cat eats..");
        }
    }

    class Horse1 extends Animal1 {
        @Override
        public void speak() {
            System.out.println("The Horse speaks YEEEEEHHHEEEE....");
        }

        @Override
        public void eat() {
            System.out.println("The Horse is eating mtchwwchttw...");
        }
    }
