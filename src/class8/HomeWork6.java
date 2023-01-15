package class8;

public class HomeWork6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2!=0){
                System.out.println("*");
            }else if(i==2||i==4){
                System.out.println(" ");
            }else{
                System.out.println("**");
            }

        }
    }
}