package supportFiles;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

//Workbook-->Sheet -->Rows -->Cells
//XSSFWorkbook --> XSSFSheet --> XSSFRow -->XSSFCell

public class ReadExcelDemo {
    public static void main(String[] args)  {
        try {

            FileInputStream file = new FileInputStream(new File("C:/intellij/excelreader.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);

            //USING ITERATOR
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                XSSFRow rw = (XSSFRow) rowIterator.next();
                Iterator<Cell> cellIterator = rw.cellIterator();

                while (cellIterator.hasNext()) {
                    XSSFCell cell = (XSSFCell) cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case NUMERIC -> System.out.print(cell.getNumericCellValue() + "\t");
                        case STRING -> System.out.print(cell.getStringCellValue() + "\t");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");

            }

            //USING FOR LOOP

            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(1).getLastCellNum();

            for (int r=0; r<=rows;r++){
                XSSFRow row = sheet.getRow(r);

                for (int c=0; c<cols;c++ ) {
                    XSSFCell cell = row.getCell(c);

                    switch(cell.getCellType())
                    {case STRING:  System.out.print(cell.getStringCellValue()); break;
                    case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
                    }
                    System.out.println(" | ");
                }
                System.out.println(" ");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

