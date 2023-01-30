package class16;

public class SyntaxEmployee {

    int empID;
   double Salary;
  static String CEO="Sumair";
  public static void main(String[] args) {
      // create a class called SyntaxEmployee, create three variables empID, salary and set the CEO to "Sumair"
      //create two objects of the class SyntaxEmployee,
        SyntaxEmployee se=new SyntaxEmployee();
        se.empID=246;
        se.Salary=80000;

        SyntaxEmployee se1=new SyntaxEmployee();
        se1.empID=246;
        se1.Salary=500000;

        System.out.println(SyntaxEmployee.CEO+""+" is the CEO");
      System.out.println(se1.Salary);
        System.out.println(se1.empID);















    }
}
