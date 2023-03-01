package class28.HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }

    public abstract void getQuote();
    public abstract void cancelInsurance();

}
class Car extends Insurance{
    String carModel;

    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    public void getQuote() {
        System.out.println("Quote1");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelled");
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName, String petType){
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    public void getQuote() {
        System.out.println("Quote2");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelled1");
    }
}
class Health extends Insurance{

    Health(String insuranceName){
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("Quote 3");
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancelled2");
    }

}
