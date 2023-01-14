package class8;

public class NestedLoops5 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println();

            if(i==1){
                continue;
            }
            for (int j = 0; j < 5; j++) {

                System.out.println("*");
            }
            System.out.println();

        }
    }
}
