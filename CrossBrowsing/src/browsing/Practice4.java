package browsing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
		
		Thread.sleep(2000);
		
		WebElement first_name = driver.findElement(By.name("first_name"));
		first_name.sendKeys("Dhiraj");
		
		Thread.sleep(2000);
		
		WebElement Last_name = driver.findElement(By.name("last_name"));
		Last_name.sendKeys("Patil");
		
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("patil.dhiraj1999@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement cell_no = driver.findElement(By.name("phone"));
		cell_no.sendKeys("9999999999");
		
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("Mark Road, Mumbai");
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Mumbai");
		
		Thread.sleep(2000);
		
		Select sel1 =  new Select(driver.findElement(By.name("state")));
		sel1.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement zip = driver.findElement(By.name("zip"));
		zip.sendKeys("32453533");
		
		Thread.sleep(2000);
		
		WebElement domain = driver.findElement(By.name("website"));
		domain.sendKeys("www.google.com");
		
		Thread.sleep(2000);
		
		
		List<WebElement> radio = driver.findElements(By.name("hosting"));
		boolean bvalue = false;
		
		bvalue=radio.get(1).isSelected();
		if(bvalue==true)
		{
			radio.get(0).click();
		}
		else
		{
			radio.get(1).click();
		}
		
		Thread.sleep(2000);
		
		WebElement description = driver.findElement(By.name("comment"));
		description.sendKeys("qwrwerwteteyeryreyrtrurtutuiyiyiyiyyiyitrtrhddgdsg");
		
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath(".//*[@id='contact_form']/fieldset/div[13]/div/button"));
		submit.click();
		
		
		driver.close();
		
		
	}

}
