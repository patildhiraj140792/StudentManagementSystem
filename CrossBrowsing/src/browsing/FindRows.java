package browsing;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindRows {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		String base_url = "http://toolsqa.com/automation-practice-table/";

		driver.get(base_url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement webtable = driver.findElement(By.id("content"));
		List<WebElement> TotalRowCount = webtable.findElements(By.xpath(".//*[@id='content']/tbody/tr"));

		System.out.println("Total Numbers of row= " + TotalRowCount);

		int RowIndex = 1;

		for (WebElement RowElement : TotalRowCount) {
			List<WebElement> TotalColCount = RowElement.findElements(By.xpath(".//*[@id='content']/tbody/tr/td"));
			int ColoumnIndex = 1;
			for (WebElement colelement : TotalColCount) {
				System.out.println("Rows" + RowIndex + "Coloumn" + ColoumnIndex + "Data" + colelement.getText());
				ColoumnIndex = ColoumnIndex + 1;
			}
			RowIndex = RowIndex + 1;
		}

	}
}
