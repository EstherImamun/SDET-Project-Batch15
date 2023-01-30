package class15;

public class StudentHM6 {
    String getGrade(int Score) {
        if (Score >= 90) {
            return "A";
        } else if (Score >= 80) {
            return "B";
        } else if (Score >= 70) {
            return "C";
        } else if (Score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        StudentHM6 studenthm6=new StudentHM6();
        System.out.println(studenthm6.getGrade(95));
    }
}







