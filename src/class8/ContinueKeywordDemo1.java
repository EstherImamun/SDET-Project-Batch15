package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {
            if(i%3==0){
                continue;// skip keyword
            }else{
                System.out.println(i);// this line is skipped when i is 3 6 or 9
            }
            System.out.println("Hello Java");
        }
    }
}
