package com.myntra.unittest;

import org.testng.annotations.Test;

import com.myntra.generic.BaseTest;
import com.myntra.pages.MainPage;

public class loginTest extends BaseTest
{
	@Test
	public void testValidLogin()
	{
		MainPage loginTest = new MainPage();
		loginTest.clickOnManIcon();
		loginTest.clickOnLoginButton();
	}
}
