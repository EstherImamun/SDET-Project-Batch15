package class18HomeWork;

public class Student {
    String name;
    String address;

    Student(String studentName, String studentAddress){
        name=studentName;
        address=studentAddress;
    }
    void printInfo(){
        System.out.println("Student's name is "+name+" and Student's Address is "+address);
    }
}
