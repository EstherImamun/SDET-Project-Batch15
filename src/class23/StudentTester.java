package class23;

public class StudentTester {
    public static void main(String[] args) {


        Student1[] students={new CollegeStudent1(),new SyntaxStudent1(),new SchoolStudent1()};

        for(Student1 student:students){
            student.doHomeWork();
            student.practice();
            student.study();
        }
    }
}
