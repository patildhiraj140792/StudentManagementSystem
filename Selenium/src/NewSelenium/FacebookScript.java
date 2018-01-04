package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookScript {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ratankul8@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rutu11223");
		driver.findElement(By.id("u_0_s")).click();
		
		driver.quit();
	}

}
