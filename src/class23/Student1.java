package class23;

public class Student1 {

    public void study(){
        System.out.println("studying....");
    }
    public void doHomeWork(){
        System.out.println("Solving homeworks");
    }
    void practice(){
        System.out.println("practicing the skills");
    }
}
class SyntaxStudent1 extends Student1{
    @Override
    public void study() {
        System.out.println("Syntax Student must study Programming");
    }

    @Override
    public void doHomeWork() {
        System.out.println("Syntax Students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax Students must practice Reples");
    }
}
class CollegeStudent1 extends Student1{
    @Override
    public void study() {
        System.out.println("College Students must practice to get good grades");
    }

}
class SchoolStudent1 extends Student1{

}
