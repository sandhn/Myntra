package com.myntra.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntra.generic.BaseTest;
import com.myntra.generic.Constant;
import com.myntra.helper.LoggerHelper;

public class MainPage
{
	private final Logger log = LoggerHelper.takeLogger(MainPage.class);
	
	@FindBy(xpath="//div[@class='desktop-userIconsContainer']")
	WebElement signin;
	
	@FindBy(xpath="//a[.='login']")
	WebElement loginbtn;
	
	public MainPage()
	{
		PageFactory.initElements(Constant.driver, this);
		BaseTest.logExtentReport("Login Page Object Created");
	}
	
	public void clickOnManIcon()
	{
		log.info("Clicking on Man Icon..");
		BaseTest.logExtentReport("Clicking on Man Icon..");
		signin.click();
	}
	
	public void clickOnLoginButton()
	{
		log.info("Clicking on Login button..");
		BaseTest.logExtentReport("Clicking on Login button..");	
		loginbtn.click();
	}
	
}
