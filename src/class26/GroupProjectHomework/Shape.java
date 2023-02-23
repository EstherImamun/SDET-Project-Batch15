package class26.GroupProjectHomework;

public interface Shape {
    public void calculateArea();
    public void calculatePerimeter();

}
class Circle implements Shape{

    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public void calculateArea(){
    double area=Math.PI*this.radius*this.radius;
    System.out.println("The area of a circle is "+area);
    }
    public void calculatePerimeter(){
        double perimeter=2*Math.PI*this.radius;
        System.out.println("The perimeter of a circle is "+perimeter);
    }

}
class Square implements Shape{
double side;
 Square(double side){
     this.side=side;
 }
  public void calculateArea(){
     double area=side*side;
      System.out.println("The area of a square is "+area);
  }
  public void calculatePerimeter(){
     double perimeter=4*side;
     System.out.println("The perimeter of a square is "+perimeter);
  }

    public static void main(String[] args) {
        Circle circle=new Circle(2.0);
        circle.calculateArea();
        circle.calculatePerimeter();

        Square square=new Square(4.5);
        square.calculateArea();
        square.calculatePerimeter();
    }
}
