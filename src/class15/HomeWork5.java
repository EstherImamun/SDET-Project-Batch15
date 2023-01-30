package class15;

public class HomeWork5 {
    boolean isPrime(int number) {
        boolean flag = true;
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }
        System.out.println(number +" is Prime " + flag);
        return flag;
    }

    public static void main(String[] args) {
        HomeWork5 hm=new HomeWork5();
        System.out.println(hm.isPrime(50));
    }

    }

