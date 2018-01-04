package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4");
		
		driver.manage().window().maximize();
		
		
		
	}

}
