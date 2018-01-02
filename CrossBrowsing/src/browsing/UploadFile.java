package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		String base_url = "http://demo.guru99.com/selenium/upload/";
		driver.manage().window().maximize();
		
		driver.get(base_url);
		
		WebElement upload_ele = driver.findElement(By.id("uploadfile_0"));
		upload_ele.sendKeys("D:\\Dh.txt");
		
		WebElement terms = driver.findElement(By.id("terms"));
		terms.click();
		
		WebElement submit  = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

}