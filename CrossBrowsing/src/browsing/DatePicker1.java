package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker1 {

	WebDriver driver;

	@BeforeTest
	public void start() {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");

		driver = new FirefoxDriver();
	}

	@Test
	public void f() {

		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		// driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement dateWidget = driver.findElement(By.id("rb-calendar_onward_cal"));
		List<WebElement> rows = dateWidget.findElement(By.tagName("tbale")).findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		//List<WebElement> columns = 
		List<WebElement> columns1 = dateWidget.findElements(By.tagName("td"));

		for (WebElement cell : columns1) {
			// Select 13th Date
			if (cell.getText().equals("27")) {
				cell.findElement(By.linkText("27")).click();
				break;
			}
		}

	}
}
