package Class30;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a Set collection that will hold Objects of Student Type.
        In this set we do not care about the  insertion order. Each student object should have
        name and studentID. Display name of each student.
         */

       // HashSet<Student1> student1s=new HashSet<>();
        Set<Student1> students1 =new HashSet<>(); // we can achieve polymorphism
        students1.add(new Student1("Fifa", 123));
        students1.add(new Student1("Lilia L", 456));
        students1.add(new Student1("Sofia S", 567));
        students1.add(new Student1("Maya M", 555));

        //Display the name of each student
        for(Student1 student:students1){
            System.out.println(student.getName());
        }



    }
}
class Student1{
    private String name;
    private int studentID;

   public Student1(String name, int studentID){
        this.name=name;
        this.studentID=studentID;
    }
    public String getName(){
       return name;
    }
    public int getStudentID(){
       return studentID;
    }
    public void displayName(){
       System.out.println(name);
    }
}


