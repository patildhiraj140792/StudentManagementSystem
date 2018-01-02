package browsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		File src = new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();

		System.out.println("Total number of rows is====>>>>>" + rowcount);

		
		for(int i = 0; i < rowcount+1; i++)
		{
			Row row = sheet1.getRow(i);
			
			for(int j=0; j< row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+"||");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i <= rowcount; i++) {
//			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
//			System.out.println("Test data from excel  is====>>>>" + data0);
//			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
//			System.out.println("Test data from excel  is====>>>>" + data1);
//			String data2 = sheet1.getRow(i).getCell(2).getStringCellValue();
//			System.out.println("Test data from excel  is====>>>>" + data2);
//			String data3 = sheet1.getRow(i).getCell(3).getStringCellValue();
//			System.out.println("Test data from excel  is====>>>>" + data3);
//			String data4 = sheet1.getRow(i).getCell(4).getStringCellValue();
//			System.out.println("Test data from excel  is====>>>>" + data4);
//		}
		wb.close();
	}

}
