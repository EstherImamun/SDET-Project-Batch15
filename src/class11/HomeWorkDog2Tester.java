package class11;

public class HomeWorkDog2Tester {
    public static void main(String[] args) {
        HomeWorkDog2 dog1=new HomeWorkDog2();
        dog1.name="Richie";
        dog1.colour="Grey and White";
        dog1.breed="Alaskan Malamute Husky";
        dog1.attitude="Assertive";
        dog1.age=5;
        dog1.fur=true;
        dog1.eats();
        dog1.bark();
        dog1.run();

        HomeWorkDog2 dog2=new HomeWorkDog2();
        dog2.name="Ragnar";
        dog2.colour="Red Brindle";
        dog2.breed="Red-Tiger Bulldog";
        dog2.attitude="Indifferent";
        dog2.age=7;
        dog2.loyal=true;
        dog2.guard();
        dog2.eats();
        dog2.bark();
        dog2.run();
        dog2.sleep();

        HomeWorkDog2 dog3=new HomeWorkDog2();
        dog3.name="Jaguar";
        dog3.breed="American Lab";
        dog3.colour="Yellow";
        dog3.attitude="Optimistic";
        dog3.fur=true;
        dog3.loyal=true;
        dog3.guard();
        dog3.bark();
        dog3.play();
        dog3.happy();
        dog3.run();






    }
}
