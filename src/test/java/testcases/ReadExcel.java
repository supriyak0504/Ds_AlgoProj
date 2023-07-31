package testcases;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel  {
    public static void main(String[] args) throws IOException {

    String excelFilePath = "C:\\intellij\\Ds\\src\\test";     //give path

    FileInputStream inputstream = new FileInputStream(excelFilePath);  //to read the file

        XSSFWorkbook workbook = new XSSFWorkbook(inputstream); //opening workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

        //USING FOR LOOP

        int rows = sheet.getLastRowNum();                              //number of rows
        int cols = sheet.getRow(1).getLastCellNum();           //number of cols

        for(int r=0;r<=rows;r++)
        {
            XSSFRow row = sheet.getRow(r);
            for(int c=0; c<cols;c++)
            {
             XSSFCell cell = row.getCell(c);
             switch(cell.getCellType()){
                 case STRING:System.out.println(cell.getStringCellValue()); break;
                 case NUMERIC:System.out.println(cell.getNumericCellValue()); break;
                 case BOOLEAN:System.out.println(cell.getBooleanCellValue()); break;
             }
                System.out.println("-------------------");
            }
        }
    }
}

