package class19;

public class Test {
    public static void main(String[] args) {
       BankAccount ba= new BankAccount();
       ba.accountNumber=75664775556783678l;
       ba.money=1000;
       ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);
        //ba.transfer(); methods defined inside child class is not available to the parent class


        System.out.println("......Creating an object of Checking Account ....");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5664;
        check.money=780;
        //features from checking class itself
        check.interest=0;

        check.deposit(); //from parent
        check.transfer(); //from child

        System.out.println("------Creating an Object of Savings account ");

        Savings save=new Savings();
        save.accountNumber=457753332345678897l;
        save.money=7639;
        save.profit=100;
        //save.interest=0; siblings features are not available

        save.deposit();//from parent
        save.takeProfit(); // comes from savings
        //save.transfer(); not available

        //finish creating SuperSavings object and see which features are available
        //to that class


        SuperSavings ss=new SuperSavings();
        ss.accountNumber=5543587988534456789l;
        ss.money=567875;
        ss.profit=5653576;
        ss.withdraw=3567876;
        ss.invest=8765543;
        ss.takeProfit();
        ss.deposit();
        ss.superSaving();



    }
}
