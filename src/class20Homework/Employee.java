package class20Homework;

public class Employee {
    String name;
    int employeeId;
    String company;

    Employee(String name, int employeeId, String company ){
        this.name=name;
        this.employeeId=employeeId;
        this.company=company;
    }

    void workHard(){
        System.out.println("The best workers gets a raise ");
    }
    void haveMeetings(){
        System.out.println("Employees are having a meeting");
    }

}
class FullTime extends Employee {

    boolean tired;
    int salary;

    FullTime(String name, int employeeId, String company, boolean tired, int salary){
        super(name,employeeId,company);
        this.tired=tired;
        this.salary=salary;
    }

    void workALot(){
        super.workHard();
        super.haveMeetings();
        System.out.println("This employee works really hard");
    }
    void highEarner(){
        System.out.println("This employee earns a lot of money");
    }
}
class PartTime extends Employee{

    String type;
    boolean happy;

    PartTime(String name, int employeeId, String company){
        super(name, employeeId, company);
    }
    void workLess(){
        System.out.println("This employee doesn't work long hours ");
    }
    void lowEarner(){
        System.out.println("This employee earns less money");
    }
}
class Subclass extends FullTime{

    boolean beautiful;

    Subclass(String name, int employeeId, String company, boolean tired,int salary, boolean beautiful){
        super(name, employeeId, company, tired, salary);
        this.beautiful=beautiful;
    }

    void greatEmployee(){
        super.workALot();
        super.highEarner();
        System.out.println("Name: "+super.name);
        System.out.println("Employee ID: "+super.employeeId);
        System.out.println("Company: "+super.company);
        System.out.println("Is she Exhausted? "+super.tired);
        System.out.println("Salary: $"+super.salary);
        System.out.println("Is she beautiful? "+this.beautiful);
        System.out.println(super.name+" is the best Employee of the Year!!!!........");
    }


    public static void main(String[] args) {
        Subclass subclass=new Subclass("Adele", 123,"Music Entertainment",true,1000000,
                true);
        subclass.greatEmployee();
    }
}


