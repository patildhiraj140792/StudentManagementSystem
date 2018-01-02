package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.name("search_query"));
		textbox.sendKeys("documentary national geographic");
		
		WebElement search = driver.findElement(By.id("search-icon-legacy"));
		search.click();
		
		
	}

}
