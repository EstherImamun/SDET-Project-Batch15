package class23;

public class Student {

    public void study(){
        System.out.println("Students are studying hard");
    }
    public void doAssignments(){
        System.out.println("Students are doing assignments ");
    }
    public void takeExams(){
        System.out.println("Students are writing exam");
    }
    public void reading(){
        System.out.println("Students are reading");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax Students are Studying really hard");
    }

    @Override
    public void doAssignments() {
        System.out.println("Syntax Students do a lot of assignments");
    }

    @Override
    public void takeExams() {
        System.out.println("At Syntax, Students take examinations");
    }

    @Override
    public void reading() {
        System.out.println("Syntax Students are reading");
    }
}
class CollegeStudent extends Student{
    @Override
    public void study() {
        System.out.println("College Students study everyday");
    }

    @Override
    public void doAssignments() {
        System.out.println("College Students are doing homework");
    }

    @Override
    public void takeExams() {
        System.out.println("College Students are having an exam...");
    }

    @Override
    public void reading() {
        System.out.println("College Students are reading");
    }
}
class SchoolStudent extends Student{
    @Override
    public void study() {
        System.out.println("School Students are studying 4 times a week");
    }

    @Override
    public void doAssignments() {
        System.out.println("School Students are doing assignments");
    }

    @Override
    public void takeExams() {
        System.out.println("School Students are taking a exam");
    }

    @Override
    public void reading() {
        System.out.println("School Students are reading.....");
    }


    public static void main(String[] args) {

        Student student=new SyntaxStudent();
        student.study();
        student.doAssignments();
        student.reading();
        student.takeExams();

        Student student1=new CollegeStudent();
        student1.study();
        student1.doAssignments();
        student1.takeExams();
        student1.reading();

        Student student2=new SchoolStudent();
        student2.study();
        student2.doAssignments();
        student2.takeExams();
        student2.reading();

        System.out.println("---------------------------------------------------");

    //Achieving Dynamic or run time polymorphism through overriding
        Student[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student stud:students){
            stud.study();
            stud.doAssignments();
            stud.takeExams();
            stud.reading();
        }





    }
}











