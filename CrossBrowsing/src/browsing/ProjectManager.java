package browsing;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectManager {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\Java+Selenium\\geckodriver-v0.18.0-win64");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/V4/manager/Managerhomepage.php");
		
		driver.manage().window().maximize();
		
		//Click Add Customer
		WebElement add_cust = driver.findElement(By.linkText("New Customer"));
		add_cust.click();
		
		//Fill information
		WebElement Cust_name = driver.findElement(By.name("name"));
		Cust_name.sendKeys("Dhiraj Patil");
		
//		Thread.sleep(2000);
//		
//		List<WebElement> Gender = driver.findElements(By.name("Gender"));
//		boolean bval = false;
//		
//		bval = Gender.get(0).isSelected();
//		
//		if(bval==true)
//		{
//			Gender.get(1).click();
//		}
//		else
//		{
//			Gender.get(0).click();
//		}
		
		Thread.sleep(2000);
		
		WebElement Birth_Date = driver.findElement(By.name("dob"));
		Birth_Date.sendKeys("1992/07/14");
		
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.name("addr"));
		address.sendKeys("Subhash colony");
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Shirpur");
		
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("Maharashtra");
		
		Thread.sleep(2000);
		
		WebElement Pincode = driver.findElement(By.name("pinno"));
		Pincode.sendKeys("425405");
		
		Thread.sleep(2000);
		
		WebElement Mob_No = driver.findElement(By.name("telephoneno"));
		Mob_No.sendKeys("9999999999");
		
		Thread.sleep(2000);
		
		WebElement Email = driver.findElement(By.name("emailid"));
		Email.sendKeys("patil.dhiraj1407@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("0987QWErty");
		
		Thread.sleep(2000);
		
		WebElement Submit = driver.findElement(By.name("sub"));
		Submit.click();
		
		Thread.sleep(5000);
		
		
		//Take ScreenShot
	
		driver.get("http://demo.guru99.com/V4/manager/CustomerRegMsg.php?cid=65807");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShot/addcust.png"));
		
		System.out.println("Screenshot Taken");
		
		
	}

}
