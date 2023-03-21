package class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("line1");
        System.out.println("line2");
        System.out.println("line3");
        System.out.println("line4");
        System.out.println("line5");
        System.out.println("line6");
        try {
            // here we put the code which might throw an error
            System.out.println(10/0);
            String str="Java";
            str.charAt(10);
           // String name = null;
           // System.out.println(name.length());
       }catch (NullPointerException npe){
        System.out.println("We are trying to access a method on a null object");
        }catch (ArithmeticException e){
            System.out.println("Someone is trying to divide by 0");
        }catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("line7");
        System.out.println("line8");
        System.out.println("line9");
    }
}
