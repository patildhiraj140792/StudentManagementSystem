package com.pack.common.pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	private WebDriver driver;

	private By EnterEmailID = By.id("identifierId");
	private By LoginBtnUser = By.xpath("RveJvd snByac");
	private By Password = By.xpath("//input[@class='whsOnd zHQkBf' AND @type='password']");
	private By LoginBtnPass = By.xpath("//content[@class='CwaK9']");

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean verifySignInPageTitle() {
		String Expected_Title = "Sign in - Google Accounts";
		String Actual_Title = driver.getTitle();
		Assert.assertEquals(Actual_Title, Expected_Title);
		return true;
	}

	public void EnterUserName(String userName) throws InterruptedException {
		WebElement EmailTxtBox = driver.findElement(EnterEmailID);
		EmailTxtBox.sendKeys("dxdhir@gmail.com");

		WebElement ClickNextBtn = driver.findElement(LoginBtnUser);
		Thread.sleep(3000);
		ClickNextBtn.click();

	}

	public void EnterPassword(String password) throws InterruptedException {
		WebElement PassTxtBox = driver.findElement(Password);
		PassTxtBox.sendKeys("9552397745");

		WebElement ClickNxtBtn = driver.findElement(LoginBtnPass);
		Thread.sleep(3000);
		ClickNxtBtn.click();

	}

}
