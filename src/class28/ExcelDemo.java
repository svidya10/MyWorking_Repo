package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path = "Data/Filedemo.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook xlsx = new XSSFWorkbook(fis);
        Sheet sheet = xlsx.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        for(int i=0; i<sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            for (int j=0; j<row.getLastCellNum();j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }

       // Row row1 = sheet.getRow(1);
        //System.out.println(row1.getCell(0));


    }
}
