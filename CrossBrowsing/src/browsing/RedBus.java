package browsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.redbus.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Pune");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Shirpur");
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
		
		WebElement next_Oct = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button"));
		next_Oct.click();
		
		WebElement Sel_Date = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[5]/td[5]"));
		Sel_Date.click();
		
		WebElement search_Bus = driver.findElement(By.id("search_btn"));
		search_Bus.click();
		
		driver.navigate().back();
		
		
		
		WebElement next_Oct1 = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button"));
		next_Oct1.click();
		
		
		WebElement Sel_Date1 = driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[1]"));
		Sel_Date1.click();
		
		
		WebElement View_seat = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[1]/div/div[1]/div[7]/div[2]/button"));
		View_seat.click();
		
		
		WebElement prize = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[2]/div[1]/div[1]/div/div/div/div[1]/div/div/ul/li[3]"));
		prize.click();
		
		
		WebElement select_seat = driver.findElement(By.xpath(".//*[@id='buses_viewonward']/div/ul/li[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div[2]/div[2]/canvas"));
		select_seat.click();
		
		
		
		
		
		
		
		
		
	}

}
