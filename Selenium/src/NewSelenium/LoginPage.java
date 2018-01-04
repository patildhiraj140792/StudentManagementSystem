package NewSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		
		driver.manage().window().maximize();
		
					
		
		WebElement firstname= driver.findElement(By.id("FirstName"));                    /*First Name*/
		
		firstname.sendKeys("Dhiraj");
		
		
		
		WebElement lastname= driver.findElement(By.id("LastName"));                      /*Last Name*/
		
		lastname.sendKeys("Patil");
		
		
		
		WebElement username= driver.findElement(By.id("GmailAddress"));			   /*Choose Your Username*/
		
		username.sendKeys("pdhiraj090");
		
		
		
		WebElement password= driver.findElement(By.id("Passwd"));				    /*Choose Password*/
		
		password.sendKeys("0987QWErty");
		
		
		
		WebElement conpassword= driver.findElement(By.id("PasswdAgain"));			/*Confirm Password*/
		
		conpassword.sendKeys("0987QWErty");
		
		
		
		driver.findElement(By.id(":0")).click();								/*Drop Down for Month*/			
		driver.findElement(By.xpath(".//*[@id=':7']/div")).click();				/*For July*/
		
		
		
		WebElement day = driver.findElement(By.id("BirthDay"));					/*Choose Birthday*/
		day.sendKeys("14");
		
		
		
		WebElement year = driver.findElement(By.id("BirthYear"));				/*Choose Birthyear*/
		year.sendKeys("1992");
		
		
		
		driver.findElement(By.id(":d")).click();								/*Choose Gender*/
		driver.findElement(By.xpath(".//*[@id=':f']")).click();					/*For Male*/
		
		
		
		driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9503566761");			/*RecoveryPhone Number*/
		
		
		
		driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("dxdhir@gmail.com"); 	/*Recovery Email*/
		
	
		
		driver.findElement(By.id(":i")).click();											/*Location*/
		driver.findElement(By.xpath(".//*[@id=':j']/div")).click();							/*For India*/
		
		
	}

}
