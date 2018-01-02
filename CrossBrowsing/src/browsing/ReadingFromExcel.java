package browsing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingFromExcel {

	public static void main(String[] args) throws Exception {
		
		
		ArrayList data = new ArrayList();
		FileInputStream file = new FileInputStream("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		Iterator row = sheet.iterator();
		
		while(row.hasNext())
		{
			Row rowit = (Row)row.next();
			
			Iterator cellit = sheet.iterator();
			while(cellit.hasNext())
			{
				Cell cells = (Cell) cellit.next();
				switch (cells.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					data.add(cells.getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					data.add(cells.getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					data.add(cells.getBooleanCellValue());
					break;
				}
			}
		}
		
	}

}
