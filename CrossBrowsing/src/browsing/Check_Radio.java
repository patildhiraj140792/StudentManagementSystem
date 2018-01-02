package browsing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Radio {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		driver.manage().window().maximize();
		
		
		WebElement Gen = driver.findElement(By.id("male"));
		Gen.click();
		
		WebElement Radio = driver.findElement(By.id("python"));
		Radio.click();
		
		WebElement Check_bx = driver.findElement(By.id("code"));
		Check_bx.click();
		

	}

}
