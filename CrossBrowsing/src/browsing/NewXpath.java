package browsing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();

		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("pune");

		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("shirpur");

		
		WebElement calender = driver.findElement(By.id("onward_cal"));
		calender.click();

		System.out.println("This Line");
		
		List<WebElement> alldates = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']"));

		for (WebElement ele : alldates) {
			String date = ele.getText();
			if (date.equals(22)) {
				ele.click();
				break;
			}
		}

		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();

	}

}
