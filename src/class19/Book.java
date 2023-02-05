package class19;

public class Book {
    String name;
    String colour;
    int price;
    double weight;

    Book(String name, String colour, int price){
        this.name=name;
        this.colour=colour;
        this.price=price;
    }

    Book(String name, String colour,int price, double weight){
        this(name,colour,price);
        this.weight=weight;
    }
    void info(){
        System.out.println("The name of the book is "+name+", The colour is "+colour+", the price is "+price+", and the weight is "+weight);
    }

    public static void main(String[] args) {
       Book book= new Book("The Whispers","Blue",45,15.0);

       book.info();
    }


}
