package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {

        String path="Files/TestExcel.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
        int noOfRows= sheet1.getPhysicalNumberOfRows();

       // List<Map<String,String>> excelData=new ArrayList<>();
        var excelData=new ArrayList<>(); //we can also use the var keyword
        for (int i = 1; i < noOfRows; i++) {
            Row row= sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap<>();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("salary",row.getCell(3));
            excelData.add(rowMap);


        }
    }
}
