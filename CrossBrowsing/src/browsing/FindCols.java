package browsing;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindCols {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://toolsqa.com/automation-practice-table/";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		int cols = driver.findElement(By.id("content")).findElement(By.tagName("thead")).findElements(By.tagName("th"))
				.size();

		int rows = driver.findElement(By.id("content")).findElements(By.tagName("tr"))
				.size();
		System.out.println("Number of rows in table= "+rows);
		
		

		// WebElement to_get_rows =
		// driver.findElement(By.xpath(".//*[@id='content']/table/thead/tr"));
		// System.out.println("Total Number of rows " + to_get_rows);

		// List<WebElement> rows =
		// driver.findElement(By.id("content")).findElement(By.tagName("tbody"))
		// .findElement(By.tagName("tr")).findElements(By.tagName("th"));
		// Iterator<WebElement> I1 = rows.iterator();

		System.out.println("Coloumn size = " + cols);

	}

}
