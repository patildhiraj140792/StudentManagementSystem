package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Adidas");
		
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		driver.findElement(By.xpath(".//*[@id='result_0']/div/div/div/ul/li[2]/span/div/a/div[2]/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='result_4']/div/div[3]/div[1]/a/h2")).click();
		
 	driver.findElement(By.xpath(".//*[@id='native_dropdown_selected_size_name']")).click();
 		
	
		
		
		
		
	}

}
