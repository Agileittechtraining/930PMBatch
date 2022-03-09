package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\Myexcel.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(); //deal with .xlsx files
Sheet s = workbook.createSheet();
Row r =   s.createRow(0);
Cell c1 =r.createCell(0);
Cell c2 =r.createCell(1);
c1.setCellValue("Hello this is written from POI sheet");
c2.setCellValue("This is 2nd cell");
workbook.write(fo);
workbook.close();
	}

}
