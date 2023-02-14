package class22;

public class CreditCard {
    double balance;
    double interest;

     public CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;

    }
    public void calculateInt(){
        System.out.println(balance*interest/100);
    }
}

class Visa extends CreditCard{

   public Visa(double balance, double interest){
        super(balance, interest);
    }
}
class AX extends CreditCard{
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInt() {
        System.out.println(balance*interest/150);
    }

    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(200, 15);
        creditCard.calculateInt();

        Visa visa=new Visa(300,30);
        visa.calculateInt();

        AX ax=new AX(500,40);
        ax.calculateInt();
    }
}
