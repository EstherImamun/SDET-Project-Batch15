package class18HomeWork;

import class18.Task1;

public class Homework3 {


    private  Homework3(){
        System.out.println("Constructor without any parameter");
    }

    Homework3(String name){
        System.out.println("Constructor with a String as parameters");
    }
    protected Homework3(int number){
        System.out.println("Constructor with an int as parameter");
    }

    public Homework3(char c){
        System.out.println("Constructor with a char as parameter");
    }

    public static void main(String[] args) {
        Homework3 hm1=new Homework3();

    }
}
