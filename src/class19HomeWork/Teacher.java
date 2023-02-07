package class19HomeWork;

public class Teacher {
    String name;
    String teacherID;
    String school;

    public void teachSubject(){
        System.out.println("Teacher is teaching Subject");
    }
    public void write(){
        System.out.println("Teacher is writing");
    }
    public void giveHomework(){
        System.out.println("Teacher is giving Homework");
    }
    public void giveExample(){
        System.out.println("Teacher is giving examples in class");
    }
}
class MathTeacher extends Teacher{
    String country;
    int salary;

    void solveMathProblems(){
        System.out.println("Math Teacher is solving some math problems");
    }
}
class ChemistryTeacher extends Teacher{
    boolean happy;
    double weight;

    void experiments(){
        System.out.println("The Chemistry Teacher is Experimenting with the chemicals at the lab");
    }
}
class PianoTeacher extends Teacher{
    String height;
    boolean smiles;
    void playsPiano(){
        System.out.println("The music teacher is playing the piano");
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.name="Pauline";
        teacher.teacherID="Pauline123";
        teacher.school="Syntax";
        teacher.teachSubject();
        teacher.write();
        teacher.giveHomework();
        teacher.giveExample();

        System.out.println("******************************************************");

        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Daniel";
        mathTeacher.teacherID="Dan677";
        mathTeacher.school="Syntax";
        mathTeacher.country="Ghana";
        mathTeacher.salary=5000;
        mathTeacher.giveExample();
        mathTeacher.solveMathProblems();
        mathTeacher.giveHomework();

        System.out.println("---------------------------------------------------------------");

        ChemistryTeacher chemistryT=new ChemistryTeacher();
        chemistryT.name="Tammy";
        chemistryT.teacherID="Tam517";
        chemistryT.school="Syntax";
        chemistryT.weight=73.3;
        chemistryT.happy=true;
        chemistryT.teachSubject();
        chemistryT.giveHomework();
        chemistryT.giveExample();
        chemistryT.experiments();

        System.out.println("-------------------------------------------------------------");

        PianoTeacher pianoT=new PianoTeacher();
        pianoT.name="James";
        pianoT.teacherID="JAY00";
        pianoT.school="Syntax";
        pianoT.height="180 cm";
        pianoT.smiles=true;
        pianoT.playsPiano();
        pianoT.giveExample();
        pianoT.write();

        System.out.println("----End of Code------");

    }
}
