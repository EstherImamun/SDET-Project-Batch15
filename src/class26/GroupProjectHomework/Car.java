package class26.GroupProjectHomework;

public class Car {
    double carPrice;
    String colour;

    Car(double carPrice, String colour){
        this.carPrice=carPrice;
        this.colour=colour;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Sedan extends Car{
    double length;
    Sedan(double carPrice, String colour,double length){
        super(carPrice,colour);
        this.length=length;
    }
    public double calculateSalePrice(){
        if(length>20){
           return super.calculateSalePrice()*0.95;
        }else{
            return super.calculateSalePrice()*0.9;
        }
    }


}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String colour, double weight) {
        super(carPrice, colour);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if(weight>2000) {
            return super.calculateSalePrice()*0.9;
        }else{
            return super.calculateSalePrice()*0.8;
        }
    }

    public static void main(String[] args) {
        Car sedan=new Sedan(25000.5,"red",20.0);
        System.out.println(sedan.calculateSalePrice());

        Car truck=new Truck(70000,"Black", 170.8);
        System.out.println(truck.calculateSalePrice());
    }
}