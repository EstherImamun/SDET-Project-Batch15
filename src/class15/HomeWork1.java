package class15;

public class HomeWork1 {
    int number(int num1,int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {
        HomeWork1 hm=new HomeWork1();
        int number= hm.number(20,50);
        System.out.println(number);
    }
}
