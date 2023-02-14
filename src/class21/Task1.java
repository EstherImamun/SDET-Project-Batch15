package class21;

public class Task1 {
    double length;
    double width;
    double area=width*length;

    Task1(double length, double width, double area){
       this.length=length;
       this.width=width;
       this.area=area;

    }
    void calculateArea(){
        System.out.println("The area of a rectangle is "+(area));
    }

}
