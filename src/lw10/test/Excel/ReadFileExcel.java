package lw10.test.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExcel {
    public static void main(String[] args) throws IOException {
        String filePath = "src/lw10/test/Excel/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);
        XSSFWorkbook workBook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workBook.getSheet("Товары");
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workBook.close();
        inputStream.close();
    }
}
