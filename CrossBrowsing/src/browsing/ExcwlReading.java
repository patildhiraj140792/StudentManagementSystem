package browsing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ExcwlReading {

	String driverpath = "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64";
	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.firefox.marionette", driverpath);
	}

	@Test
	public void f() throws Exception {

		File source = new File("C:\\Users\\admin\\Desktop\\Java+Selenium\\TestCase1.xlsx");

		FileInputStream fis = new FileInputStream(source);

		XSSFWorkbook wb1 = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb1.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();

		System.out.println("Total Number of Rows is = " + rowcount);

		for (int i = 0; i <= rowcount; i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Coloumn Data " + data0);
			String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Coloumn Data " + data1);

		}

		wb1.close();
	}

	@AfterTest
	public void afterTest() {

	}

}
