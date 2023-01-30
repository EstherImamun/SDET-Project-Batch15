package class15;

public class HomeWork2 {
    int isEven(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }
        return num;
    }

    public static void main(String[] args) {
        HomeWork2 hm=new HomeWork2();
        int isEven= hm.isEven(50);
    }



}
