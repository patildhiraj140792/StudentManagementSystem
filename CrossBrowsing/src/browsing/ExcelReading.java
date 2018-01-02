package browsing;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		File src = new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();

		System.out.println("Data from excel file is=====>>>>" + data0);

		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();

		System.out.println("Data from excel file is=====>>>>" + data1);

		String data2 = sheet1.getRow(0).getCell(2).getStringCellValue();

		System.out.println("Data from excel file is=====>>>>" + data2);

		String data3 = sheet1.getRow(0).getCell(3).getStringCellValue();

		System.out.println("Data from excel file is=====>>>>" + data3);

		String data4 = sheet1.getRow(0).getCell(4).getStringCellValue();

		System.out.println("Data from excel file is=====>>>>" + data4);

		wb.close();
	}

}
