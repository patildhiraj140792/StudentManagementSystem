package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		//First Name
		WebElement f_name = driver.findElement(By.name("firstname"));
		f_name.sendKeys("Dhiraj");
		
		//Last Name
		WebElement L_name = driver.findElement(By.name("lastname"));
		L_name.sendKeys("Patil");
		
		//Sex
		List<WebElement> radio = driver.findElements(By.name("sex"));
		boolean bvalue = false;
		
		bvalue=radio.get(0).isSelected();
		if(bvalue==true)
		{
			radio.get(1).click(); 
		}
		else
		{
			radio.get(0).click();
		}
		
		//Year Of Exp
		
		WebElement Year_exp = driver.findElement(By.id("exp-1"));
		Year_exp.click();
		
		//Profession
		
		List<WebElement>Profession = driver.findElements(By.name("Profession"));
		int isize = Profession.size();
		
		for(int i=0;i<isize;i++)
		{
			String svalue = Profession.get(i).getAttribute("value");
			
			if(svalue.equalsIgnoreCase("Automation Tester"))
			{
				Profession.get(i).click();
				break;
			}
		}
		
		//Automation Tool
		
		WebElement chk_auto = driver.findElement(By.id("tool-1"));
		chk_auto.click();
		
		driver.quit();
				
	
	
	
	}

}
