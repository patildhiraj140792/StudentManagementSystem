package browsing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		
		List<WebElement>click= driver.findElements(By.xpath(".//*[@class='cb1-element' and @type='checkbox']"));
		
		for(int i=0; i<click.size();i++)
		{
			WebElement ele = click.get(i);
			
			String s1= ele.getAttribute("type");
			
			System.out.println("Type from check boxes====>>>>"+s1);
		}
		
		
		
//		WebElement op1= driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[1]/label/input"));
//		op1.click();
//	
//		Thread.sleep(2000);
//		
//		WebElement op2= driver.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[2]/div[2]/div[2]/label/input"));
//		op1.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement op3= driver.findElement(By.xpath(".//*[@id='easycont']/div/div[3]/div[3]/div[3]/div[3]/label/input"));
//		op1.click();
//		
//		Thread.sleep(2000);
//		
//		WebElement op4= driver.findElement(By.xpath(".//*[@id='easycont']/div/div[4]/div[4]/div[4]/div[4]/label/input"));
//		op1.click();
//		
		Thread.sleep(2000);
			
			
			
			
			
	}
	}

