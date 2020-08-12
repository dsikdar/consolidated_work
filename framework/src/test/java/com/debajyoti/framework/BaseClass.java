package com.debajyoti.framework;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class BaseClass extends Utils{
	
	//public WebDriver driver;
	@BeforeSuite
	void init() {
		System.setProperty("Webdriver.chrome.driver", "E://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://debajyotisikdar.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		createExtentReport();
	}
	@AfterSuite
	void cleanup() {
	closeExtentReport();
	driver.quit();
	}
	@DataProvider(name="provideUserNamePhoneNumber")
	public static Object[][] provideUserNamePhoneNumber() throws Exception
	{
		String[][] namePhoneNumber=getUserNamePhoneFromExcel();
		return namePhoneNumber;
	}
}
