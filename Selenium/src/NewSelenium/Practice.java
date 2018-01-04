package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchDropdownBox")).click();
		
		//driver.findElement(By.linkText("search-alias=computers")).click();
		
		//Select selmenu = new Select(driver.findElement(By.id("All")));
		
		//selmenu.selectByVisibleText("search-alias=fashion");
		
		//selmenu.selectByIndex(8);
		
		Select sel = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		sel.selectByVisibleText("Books");
		
		sel.selectByIndex(8);
		
		
	}

}
