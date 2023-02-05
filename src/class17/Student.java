package class17;

public class Student {
    String name;
    String id;
    int age;
    double weight;

    public Student(String sName,String sId,int sAge){
        id=sId;
        name=sName;
        age=sAge;
    }

    public Student(String sName, int sAge,String sId){
        id=sId;
        name=sName;
        age=sAge;
    }


   public Student(String studentName, String studentId, int studentAge, double studentWeight){
        name=studentName;
        id=studentId;
        age=studentAge;
        weight=studentWeight;
    }
    void printInfoS(){
        if(weight==0){
            System.out.println("Name "+name+" ID "+id+" Age "+age);
        }else{
            System.out.println("Name "+name+" ID "+id+" Age "+age+" weight "+weight);
        }

    }
}
