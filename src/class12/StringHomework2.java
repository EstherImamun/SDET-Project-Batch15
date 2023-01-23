package class12;

public class StringHomework2 {
    public static void main(String[] args) {
      /*  String str="January";
        char symbol1=str.charAt(6);
        char symbol2=str.charAt(5);
        char symbol3=str.charAt(4);
        char symbol4=str.charAt(3);
        char symbol5=str.charAt(2);
        char symbol6=str.charAt(1);
        char symbol7=str.charAt(0);
        System.out.print(symbol1+" "+symbol2+" "+symbol3+" "+symbol4+" "+symbol5+" "+symbol6+" "+symbol7);*/


        String day="Sunday";
        String reverse="";
        for (int i = 0; i < day.length(); i++) {
            reverse=day.charAt(i)+reverse;
        }
        System.out.println(reverse);

        System.out.println("*****-------------------");


        StringBuilder sb=new StringBuilder();
        String string="Sunday";
        sb.append(string);
        sb.reverse();
        System.out.println(sb);




            }


            }



