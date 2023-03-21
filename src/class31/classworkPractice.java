package class31;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Properties;

public class classworkPractice {
      public static void main(String[] args) throws IOException {
        String path = "Files/TestExcel.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet1 = xssfWorkbook.getSheet("Sheet1");

        int noOfRows = sheet1.getPhysicalNumberOfRows();

        List<Map<String, String>> excelInfo = new ArrayList<>();

        for (int i = 1; i < noOfRows; i++) {
            Row row = sheet1.getRow(i);
            LinkedHashMap rMap = new LinkedHashMap<>();
            rMap.put("Name",row.getCell(0));
            rMap.put("Age",row.getCell(0));
            rMap.put("City",row.getCell(0));
            rMap.put("salary",row.getCell(0));
            excelInfo.add(rMap);

        }
    }


}
