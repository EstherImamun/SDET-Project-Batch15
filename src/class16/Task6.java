package class16;

public class Task6 {
    String getScore(int Score){
        if(Score>=90){
            return "A";
        } else if (Score>=80) {
           return "B";
        }else if(Score>=70){
            return "C";
        } else if (Score>=50) {
          return "D";
        }else{
            return "F";
        }
    }

    public static void main(String[] args) {

        Task6 task6=new Task6();
        System.out.println(task6.getScore(90));
    }
}
