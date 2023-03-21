package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // Location of file on the computer
        String path="Files/TestExcel.xlsx";
        //Navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);
        // XXSFWorkbook is a class that knows how to read and write data to an Excel file
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //from the Excel file we need to get the sheet first using below method
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        // as we are interested in the row 1, we pass 1 inside the getRow method
        //rows and columns are indexed based just like arrays
        Row row= sheet1.getRow(1);
        Cell cell=row.getCell(1);

        // All the numbers are treated as doubles in Excel
        System.out.println(cell);
    }
}
