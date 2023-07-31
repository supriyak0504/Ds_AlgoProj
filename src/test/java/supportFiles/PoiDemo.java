package supportFiles;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PoiDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "S:\\Education-Selenium SDET\\excelReading_demo\\poidemo.xlsx";
        File myfile = new File(filePath);
        Workbook wb = new XSSFWorkbook();
        Sheet s1 = wb.createSheet("Supriya");


        FileOutputStream fout = new FileOutputStream(myfile);
        wb.write(fout);
        fout.close();
        System.out.println("File Creation");




    }
}
