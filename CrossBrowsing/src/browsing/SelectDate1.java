package browsing;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDate1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette",
				"C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Pune");
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Shirpur");
		
		String select_date = "09/22/2017";
		
		Date d = new Date(select_date);
		
		SimpleDateFormat dt = new SimpleDateFormat("MMMM/DD/YYYY");
		
		String date = dt.format(d);
		
		System.out.println(date);
		
		String[] split = date.split("/");
		
		System.out.println(split[0]+" "+split[1]+""+split[2]);
		
		
		
		
		
	}

}
