package class25;

public interface Movable {
    void move();
}
interface OwnAble{
    void own();
}
class Car implements Movable,OwnAble{
    @Override
    public void move() {
        System.out.println(" I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
}
class Dog implements Movable,OwnAble{
    @Override
    public void move() {
        System.out.println("I can move");
    }

    @Override
    public void own() {
        System.out.println("You can own me");
    }
        public static void main(String[] args) {
        Movable[] movable={new Car(),new Dog()};
        for(Movable m:movable){
            m.move();
        }
        System.out.println("-------------------------------");

        OwnAble[] ownAbles={new Car(),new Dog()};
        for(OwnAble own:ownAbles){
            own.own();
        }

        System.out.println("Using a different For Loop......");
        System.out.println("------------------------------------");

        Movable[] movable1={new Car(),new Dog()};
        for (int i = 0; i < movable1.length; i++) {
            Movable m=movable1[i];
            m.move();
        }
        System.out.println("--------------------------------");

        OwnAble[] ownAbles1={new Car(),new Dog()};

        for (int i = 0; i < ownAbles1.length; i++) {
            OwnAble own=ownAbles1[i];
            own.own();
        }
    }
}
