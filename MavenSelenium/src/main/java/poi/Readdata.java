package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Readdata {

	    public String readrowandcell(String location,String sheetname,int row,int cell) throws IOException {
		FileInputStream fi = new FileInputStream(location);
		XSSFWorkbook workbook = new XSSFWorkbook(fi);
		Sheet s = workbook.getSheet(sheetname);
		Row r =   s.getRow(row);
		Cell c1 =r.getCell(cell);
		String output = c1.getStringCellValue();
		workbook.close();
		return output;
	}

}