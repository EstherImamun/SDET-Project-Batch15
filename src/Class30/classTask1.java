package Class30;

import java.util.HashMap;

public class classTask1 {
    public static void main(String[] args) {
        /*
        ClassWork;
        Create a map of a building. Store floor number and it's associated company name.
        (Example: 1= Google, 2=Syntax etc...) Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
         */
        HashMap<Integer,String> building=new HashMap<>();
        building.put(1,"Google");
        building.put(2,"Synatx");
        building.put(3,"Facebook");
        building.put(4,"Instagram");
        building.put(5,"FireFox");
        building.put(2,"Syntax");
        building.put(6,"Safari");
        building.put(1,"Google");
        building.put(7,"Snapchat");
        building.put(1,"Google");
        System.out.println(building);
        building.replace(4,"GoogleChrome");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);

    }
}
