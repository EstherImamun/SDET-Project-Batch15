package Class30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami ");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

        //ClassWork: remove all the keys from above map if they are greater than 2
        /* My method:
        Set<Integer> students=studentsMap.keySet();
        students.removeIf(x-> x>2);
        System.out.println(students);
        System.out.println(studentsMap);*/

        //Teacher's Method
        Set<Integer> keys=studentsMap.keySet();
        keys.removeIf(x->x>2);
        System.out.println(keys);
        System.out.println(studentsMap);



    }
}
