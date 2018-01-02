package com.pack.common.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BasePage {

	protected WebDriver driver;
	private By signButton = By.linkText("Sign in");
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@Test
	public SignInPage clickSignBtn()
	{
		System.out.println("Clicking on sign Button");
		WebElement SignInBtn = driver.findElement(signButton);
		
		if(SignInBtn.isDisplayed()||SignInBtn.isEnabled())
		{
			SignInBtn.click();
		}
		else
		{
			System.out.println("Element not found");
		}
		return new SignInPage(driver);
		
	}
	
	public String getpagetitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle()
	{
		String expectedtitle = "Google";
		return getpagetitle().contains(expectedtitle);
		
		
	}
	
}
