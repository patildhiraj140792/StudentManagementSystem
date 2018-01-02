package browsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(5).setCellValue("Status");
		
		sheet.getRow(1).createCell(5).setCellValue("Active");
		
		sheet.getRow(2).createCell(5).setCellValue("Inactive");
		
		sheet.getRow(3).createCell(5).setCellValue("Active");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		System.out.println("Done......");
	}

}
