package browsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOnExcel {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		File source = new File("C:\\Users\\admin\\Desktop\\TestCase1.xlsx");

		FileInputStream fis = new FileInputStream(source);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(4).setCellValue("Status");
		
		sheet1.getRow(1).createCell(4).setCellValue("pass");
		
		sheet1.getRow(2).createCell(4).setCellValue("fail");
		
		sheet1.getRow(3).createCell(4).setCellValue(14.30);
		
		FileOutputStream fout = new FileOutputStream(source);
		
		wb.write(fout);
		
		System.out.println("Successfully Write the content in file");
		wb.close();
	}

}
