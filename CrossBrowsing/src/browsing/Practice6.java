package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		Select sel1 = new Select(driver.findElement(By.id(("continents"))));
		sel1.deselectByIndex(2);
		
		List<WebElement> check_size = sel1.getOptions();
		int ilistsize = check_size.size();
		
		for(int i=0;i<ilistsize;i++)
		{
			String value = sel1.getOptions().get(i).getText();
			System.out.println(value);
			
			if(value.equalsIgnoreCase("Africa"))
			{
				sel1.selectByIndex(i);
				break;
			}
		}
		driver.quit();
		
	}

}
