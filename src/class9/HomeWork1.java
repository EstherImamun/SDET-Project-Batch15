package class9;

public class HomeWork1 {
    public static void main(String[] args) {
        char[] grades={'A','B','C','D','E','F'};
        for (int i = 0; i < grades.length; i++) {
            if(grades[i]=='B'){
                System.out.println(grades[i]);
            }
        }
        System.out.println("*********************************************");

        char[] grades1={'A','B','C','D','E','F'};
        grades1[1]='B';
        for (int i = 0; i < grades1.length; i++) {
            if(grades1[i]=='B'){
                System.out.println(grades1[i]);
            }
        }

    }
}
