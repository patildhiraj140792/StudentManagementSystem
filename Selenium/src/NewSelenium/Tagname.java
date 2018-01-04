package NewSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//WebElement s1 = driver.findElement(By.tagName("a"));
		
		List s1 = driver.findElements(By.tagName("input"));
		List s2 = driver.findElements(By.tagName("a"));
		
		
		int total = s1.size();
		int total1 = s2.size();
		
		System.out.println("Total Input tag in specified website is ="+total);
		System.out.println("Total Anchor tag in specified website is ="+total1);
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
