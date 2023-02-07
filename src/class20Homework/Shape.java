package class20Homework;

public class Shape {

    double radius;

    Shape(double radius){
      this.radius=radius;

    }

}
class Circle extends Shape{
    double area;
    Circle(double radius){
        super(radius);
    }
    void areaOfCircle(){
        System.out.println("The area of a circle is "+(3.14*radius*radius));
    }

    public static void main(String[] args) {
        Circle circle=new Circle(2.5);
            circle.areaOfCircle();
        }
    }

