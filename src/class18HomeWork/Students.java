package class18HomeWork;

public class Students {
    String name;
    int  mathGrade;
    int  englishGrade;
    int chemistryGrade;
    double averageGrade;

    Students(String studentName, int studentMathGrade,int studentEnglishGrade, int studentChemistryGrade){
     name=studentName;
     mathGrade=studentMathGrade;
     englishGrade=studentEnglishGrade;
     chemistryGrade=studentChemistryGrade;
      averageGrade=(mathGrade+englishGrade+chemistryGrade)/3;
    }
    void averageGradeInfo(){
        System.out.println(name+" "+averageGrade);
    }


}
