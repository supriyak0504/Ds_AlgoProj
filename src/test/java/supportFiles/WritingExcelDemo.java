package supportFiles;


//Workbook-->Sheet -->Rows -->Cells
//XSSFWorkbook --> XSSFSheet --> XSSFRow -->XSSFCell


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcelDemo {
    public static void main(String[] args) throws IOException {


        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Emp Info");

        Object empData [][] = {  {"EmpID", "Name", "Job"},
                                 {101, "David", "Engineer"},
                                 {102, "Smith", "QA"},
                                 {103, "Jon Doe", "DevOps"},

                               };

        //Using for loop
        int rows = empData.length;
        int cols = empData[0].length;

        System.out.println(rows);
        System.out.println(cols);

        for(int r =0;r<rows;r++){
            XSSFRow row = sheet.createRow(r);

            for(int c = 0;c<cols;c++) {
                XSSFCell cell = row.createCell(c);
                Object value = empData[r][c];

                if(value instanceof String)
                    cell.setCellValue((String)value);
                if(value instanceof Integer)
                    cell.setCellValue((Integer)value);
                if(value instanceof Boolean)
                    cell.setCellValue((Boolean)value);
            }
        }

        String filePath = "C:/intellij/emp.xlsx";
        FileOutputStream outStream = new FileOutputStream(filePath);
        workbook.write(outStream);

        outStream.close();

        System.out.println("emp.xlsx written successfully");
    }


}
