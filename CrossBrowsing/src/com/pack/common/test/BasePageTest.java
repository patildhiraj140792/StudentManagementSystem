package com.pack.common.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobject.BasePage;

public class BasePageTest extends TestBaseSetup{

	private WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		driver= getdriver();
	}
	
	@Test
	
	public void verifyhomepage()
	{
		System.out.println("Home Page Test");
		BasePage basepage = new BasePage(driver);
		Assert.assertEquals(basepage.verifyBasePageTitle(), "Home Page Tilte Dont Match");
	}
	
}
