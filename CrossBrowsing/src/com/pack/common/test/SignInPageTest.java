package com.pack.common.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pack.base.TestBaseSetup;
import com.pack.common.pageobject.BasePage;
import com.pack.common.pageobject.SignInPage;

public class SignInPageTest extends TestBaseSetup{

	private WebDriver driver;
	private SignInPage signInPage;
	private BasePage basePage;
	
	@BeforeClass
	public void setUp() {
		driver=getdriver();
	}
	
	@Test
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePage(driver);
		signInPage = basePage.clickSignBtn();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Unable to sign in");

	}
}
