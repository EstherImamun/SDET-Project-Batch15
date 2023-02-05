package class18HomeWork;

public class Book {
    String name;
    String colour;
    int price;

    Book(String bookName, String bookColour){
        name=bookName;
        colour=bookColour;
    }
    Book(String bookName, String bookColour, int bookPrice){
        this(bookName,bookColour);
        price=bookPrice;
    }
    void printInfo(){
        System.out.println("The name of the book is "+name+", it's colour is "+colour+" and the price is "+price);
    }
}
