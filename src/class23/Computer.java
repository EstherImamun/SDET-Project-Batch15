package class23;

public class Computer {
    String name;
    String colour;
    double price;

    Computer(String name, String colour, int price){
        this.name=name;
        this.colour=colour;
        this.price=price;
    }
    public void starts(){
        System.out.println("Computer is starting..");
    }
    public void makeZoomMeetings(){
        System.out.println("Computer is loading a zoom meeting");
    }
    public void showSearchResults(){
        System.out.println("Computer is Showing search results ");
    }
    public void showOutput(){
        System.out.println("Computer is showing output");
    }
}
class Apple extends Computer{
    public Apple(String name, String colour, int price) {
        super(name, colour, price);
    }
    @Override
    public void showSearchResults() {
        System.out.println("Apple computer is showing results of your search input");
    }

    @Override
    public void showOutput() {
        System.out.println("Apple computer is showing output of you code");
    }

    public void macOS(){
        System.out.println("Apple computers have macOS");
    }

    public void storage(){
        System.out.println("Apple computer has lots of storage");
    }
}
class Lenovo extends Computer{
    public Lenovo(String name, String colour, int price) {
        super(name, colour, price);
    }

    @Override
    public void makeZoomMeetings() {
        System.out.println("Lenovo computer is setting up Zoom meeting");
    }

    @Override
    public void showOutput() {
        System.out.println("Lenovo computer is showing output");
    }

    public void quality(){
        System.out.println("Lenovo computers are good quality");
    }
    public void qualityScreenDisplay(){
        System.out.println("Lenovo computers have a good quality screen display");
    }
}
class HP extends Computer{
    public HP(String name, String colour, int price) {
        super(name, colour, price);
    }

    @Override
    public void starts() {
        System.out.println("Hp computer is starting to load");
    }

    @Override
    public void showSearchResults() {
        System.out.println("HP computer shows the result...");
    }

    public void LongLasting(){
        System.out.println("HP computers lasts a lifetime!!");
    }
    public void prints(){
        System.out.println("HP computer can print files and documents");
    }
}
class Dell extends Computer{
    public Dell(String name, String colour, int price) {
        super(name, colour, price);
    }

    @Override
    public void starts() {
        System.out.println("Dell computer is starting");
    }

    @Override
    public void makeZoomMeetings() {
        System.out.println("Dell computer is making a Zoom meeting....");
    }

   public void old(){
       System.out.println("Dell computer is old.... ");
   }
   public void speed(){
       System.out.println("Dell computer is fast ...");
   }


    public static void main(String[] args) {
        Computer[] computer={new Apple("macBook pro","Grey", 2000),
                new Lenovo("Lenovo Legion 7 Gen 6 (AMD)","Black",1960),
                new HP("HP Elite Book","Grey",1049),
                new Dell("Latitude Laptop","Black",649)};

        for(Computer computers:computer){
            computers.starts();
            computers.makeZoomMeetings();
            computers.showSearchResults();
            computers.showOutput();
            System.out.println("Name of computer: "+computers.name);
            System.out.println("Colour: "+computers.colour);
            System.out.println("Price: "+computers.price);
            System.out.println("----------------------------------------------------------");


        }
    }

}