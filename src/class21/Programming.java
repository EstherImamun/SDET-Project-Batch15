package class21;

public class Programming {

    Programming(){
        System.out.println("I love programming");
    }
    Programming(String word){
        System.out.println("I love programming"+word);
    }

    public static void main(String[] args) {
        new Programming("Java");
        Programming program=new Programming();
    }
}
