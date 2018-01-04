package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.lift.find.Finder;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg extends Selenium {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Test Selenium");
		
		driver.findElement(By.xpath(".//*[@id='pass']"));
		
		driver.findElement(By.xpath(".//*[@id='pass']")).click();
		
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@id='day']")));

		sel1.selectByVisibleText("Jan");
		
		Select sel2=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		
		sel2.selectByValue("6");
		
		
		Select sel3=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		
		sel3.selectByIndex(6);
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_m']")).click();
		
		driver.quit();
	
		
	}

}
