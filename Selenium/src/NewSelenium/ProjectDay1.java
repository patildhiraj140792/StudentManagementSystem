package NewSelenium;



import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProjectDay1 {

	
	
	public static void main(String[] args) {
	
		
		
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4");
		
		driver.manage().window().maximize();
		
		WebElement user_id = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
		user_id.sendKeys("mngr91970");
		
		WebElement password = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("rezyman");
		
		WebElement btn = driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		btn.click();
		
	}
	
	public void waitForMiliSecond(long sec){
	   try {
		Thread.sleep(sec);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
}

	@Test
	public void test1() throws FileNotFoundException{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/V4");
		waitForMiliSecond(2000);
		
		driver.manage().window().maximize();
		waitForMiliSecond(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		WebElement user_id = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
		waitForMiliSecond(1000);
	
		user_id.sendKeys("mngr91970");
		waitForMiliSecond(1000);
		
		WebElement password = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("rezyman");
		waitForMiliSecond(2000);
		
		WebElement btn = driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		///////////////////////////////////////////////
		
				
		//	if(i==0){
	//			positiveMethod();
			//}
		}
		
		
//		public void positiveMethod(){
		//	assert.assertTrue(driver.getTitle().equals("pagetitlke"));
}
		
		//////////////////////////////////////////////
	
	
	    
		