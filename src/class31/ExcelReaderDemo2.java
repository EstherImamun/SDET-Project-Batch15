package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

        String path="Files/TestExcel.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");

        /*
        getPhysicalNumberOfRows()
        it returns the number of rows that actually contain the data in Excel file
         */

        int noOfRows= sheet1.getPhysicalNumberOfRows();
        /*
        we need one loop to go through all the rows one by one
         */
        for (int i = 0; i < noOfRows; i++) {
            Row row= sheet1.getRow(i);
            //Tells us how many cells contain the data
            int noOfCells=row.getPhysicalNumberOfCells();
            //to go through all the cells from each row
            for (int j = 0; j < noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }
    }
}
