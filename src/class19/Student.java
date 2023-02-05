package class19;

public class Student {
    String name;
    String Address;

    Student(String name, String Address){
        this.name=name;
        this.Address=Address;

    }
    void info(){
        System.out.println("Student's name is "+name+" and Student's address is "+Address);
    }

    public static void main(String[] args) {
       Student student= new Student("Piper","2, allen street");
student.info();
    }
}
