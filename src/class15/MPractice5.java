package class15;

public class MPractice5 {
    String printSchool(){
        return "Syntax";
    }
    String createEmail(String username,String lastname,String email){
        String email2=username+lastname+"@"+email+".com";
        return email2.toLowerCase();

        }
        public static void main(String[] args) {    // Tester
        MPractice5 mp=new MPractice5();
        System.out.println(mp.createEmail("imams","josh","gmail"));
    }
    }






