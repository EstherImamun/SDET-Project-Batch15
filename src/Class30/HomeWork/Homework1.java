package Class30.HomeWork;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Homework1 {
    public static void main(String[] args) {
        Map<Integer,String> bestBuySt=new LinkedHashMap<>();
        bestBuySt.put(5337,"TV");
        bestBuySt.put(1234,"Printer");
        bestBuySt.put(5672,"Ipad");
        bestBuySt.put(8904,"computer");
        bestBuySt.put(2456,"Phone");

        var bestBuy=bestBuySt.entrySet();
        System.out.println(bestBuy);
    }
}
