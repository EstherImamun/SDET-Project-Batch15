package Class30.HomeWork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework3 {
    public static void main(String[] args) {
        Map<String,Integer> employee=new HashMap<>();
        employee.put("Mark Robert",100000);
        employee.put("Rachel Brooks",150000);
        employee.put("Tom Hank",180000);
        employee.put("John Smith",90000);
        employee.put("Ruth Jeff",120000);

        Collection<Entry<String,Integer>> people=employee.entrySet();
        int biggestS=0;
        String nameOfEmp="";
        for (Entry<String,Integer> p:people
             ) {
            if(p.getValue()>biggestS){
                biggestS=p.getValue();
                nameOfEmp=p.getKey();
            }
        }
        System.out.println(nameOfEmp+"=$"+biggestS);
        }
        }


