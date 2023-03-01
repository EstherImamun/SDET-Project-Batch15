package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

       /* for (String s:words) {//not going to workbecause you are trying to remove or change an element in the
            if(s.endsWith("a")){  //ArrayList
                words.remove(s);
            }

        }*/

        for (int i = 0; i < words.size(); i++) {  // this may work but it's not sustainable
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }
        System.out.println(words);



       /* ArrayList<String> names=new ArrayList<>(); my personal code that i wrote
        names.add("ruth");
        names.add("panos");
        names.add("Joy");
        names.add("Happy");

        for(String name:names){
            if(name.endsWith("y")){
                names.remove(name);
            }
        }

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).endsWith("y")){
                names.remove(i);
            }
        }*/




    }
}
