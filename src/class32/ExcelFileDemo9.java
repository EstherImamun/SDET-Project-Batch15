package class32;

import Class30.Entry;
import utils.ExcelReader;

import javax.xml.stream.events.EntityReference;
import java.io.IOException;
import java.util.*;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

       List<Map<String,String>> excelData= ExcelReader.read();
      // var excelData= ExcelReader.read(); // we can also use this
       // System.out.println(excelData);
       // Map<String, String> firstRow = excelData.get(1);
        //System.out.println(firstRow.get("salary"));
        for(Map<String,String> row:excelData){
            for(Map.Entry<String, String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("------------------------------------");
        }


    }
}
