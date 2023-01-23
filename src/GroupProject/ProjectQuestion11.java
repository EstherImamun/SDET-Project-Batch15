package GroupProject;

public class ProjectQuestion11 {
    public static void main(String[] args) {
        String[] names={"Jamie","Meagan","Oliver","Diana","Meagan"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j <names.length; j++) {
               if(names[i].equals(names[j])){

                   System.out.println(names[i]);
               }
            }

        }
    }
}
