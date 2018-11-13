package com.myntra.generic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser 
{
	public static void getBrowser(String browser)
	{
	if(System.getProperty("os.name").contains("Window")){
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("Working on "+ System.getProperty("os.name")+" and Browser is Firefox");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			Constant.driver = new FirefoxDriver();
			Constant.driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//https://chromedriver.storage.googleapis.com/index.html
			System.out.println("Working on "+ System.getProperty("os.name")+" and Browser is Chrome");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			Constant.driver = new ChromeDriver();
			//driver.manage().window().maximize();
		}
	}
	else if(System.getProperty("os.name").contains("Mac")){
		System.out.println(System.getProperty("os.name"));
		if(browser.equalsIgnoreCase("firefox")){
			System.out.println("Working on "+ System.getProperty("os.name")+" and Browser is Firefox");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver");
			Constant.driver = new FirefoxDriver();
			Constant.driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome")){
			System.out.println("Working on "+ System.getProperty("os.name")+" and Browser is Chrome");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
			Constant.driver = new ChromeDriver();
			Constant.driver.manage().window().maximize();
		}
	}
	}
}
