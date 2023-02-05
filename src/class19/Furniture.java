package class19;

public class Furniture {
    String type;
    double price;
    String colour;

    //with the help of constructor, we can initialize object with specific value
    Furniture(String type, double price, String colour){
       this.type=type;
       this.price=price;
       this.colour=colour;
    }

    /*below is a method with name Furniture. why - because of return type
    void Furniture(){

    }
    */

    void print(){
        System.out.println(type+" price is "+price+" and colour is "+colour);
    }
}
