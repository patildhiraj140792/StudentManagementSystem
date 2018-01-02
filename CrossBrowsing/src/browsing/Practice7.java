package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice7 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		Select sel1 = new Select(driver.findElement(By.name("selenium_commands")));
		
		
		//SELECT
		sel1.selectByIndex(0);
		
		Thread.sleep(2000);
		
		//DESELECT
		sel1.deselectByIndex(0);
		
		Thread.sleep(2000);
		
		
		//SelectByVisibleText
		sel1.selectByVisibleText("Navigation Commands");
		
		Thread.sleep(2000);
		
		//DeselectByVisibleText
		sel1.deselectByVisibleText("Navigation Commands");
		
		
		//get all option
		List<WebElement> all_check = sel1.getOptions();
		
		int List_size=all_check.size();
		
		for(int i=0; i<List_size;i++)
		{
			String value = sel1.getOptions().get(i).getText();
			System.out.println(value);
			
		    sel1.selectByIndex(i);
		    Thread.sleep(2000);
		}
		
		
		//Deselect all option
		sel1.deselectAll();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
