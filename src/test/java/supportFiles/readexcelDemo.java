package supportFiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class readexcelDemo {
    public static void main(String[] args)  {
        try {

            FileInputStream file = new FileInputStream(new File("S:\\Education-Selenium SDET\\excelReading_demo\\poidemo.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row rw = rowIterator.next();
                Iterator<Cell> cellIterator = rw.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                    }
                }
                System.out.println("");

            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

