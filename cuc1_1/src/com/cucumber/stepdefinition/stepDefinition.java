package com.cucumber.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.Assert.assertEquals;

public class stepDefinition {
	public WebDriver driver;
	String text;
	String click, customername, age, address, phonenumber, email, expname;
	String Expected = "Registered Succesfully";
	
	String xpathCname="//input[@name='cname']";
	String xpathAge="//input[@name='age']";
	String xpathAddress="//input[@name='address']";
	String xpathPhonenumber="//input[@name='phonenumber']";
	String xpathEmail="//input[@name='email']";
	String xpathSubmitbutton="//input[@id='submit']";
	String xpathResetbutton="//input[@id='reset']";
	
	String arg1val,arg2val,arg3val,arg4val,arg5val;
	
	String xpathCnamesaved="(//td)[2]";
	String xpathAgesaved="(//td)[4]";
	String xpathAddresssaved="(//td)[6]";
	String xpathPhonesaved="(//td)[8]";
	String xpathEmailsaved="(//td)[10]";
	
	@Given("^User launches the Registration URL$")
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "E://geckodriver.exe");
    	FirefoxBinary firefoxBinary = new FirefoxBinary();
    	firefoxBinary.addCommandLineOptions("--headless");
        FirefoxProfile profile=new FirefoxProfile();
    	FirefoxOptions firefoxOptions = new FirefoxOptions();
    	firefoxOptions.setBinary(firefoxBinary);
    	firefoxOptions.setProfile(profile);
        driver=new FirefoxDriver(firefoxOptions);
		driver.get("http://webapps.tekstac.com/CustomerRegistration/Index");
        
	}
	//When User enters <name> <Age> <Address> <Phone Number> <Email> clicks <submit>
	@When("^User enters name as \"([^\"]*)\",Age as \"([^\"]*)\",Address as \"([^\"]*)\",Phone Number as \"([^\"]*)\",Email as \"([^\"]*)\",clicks \"([^\"]*)\"$")
	//@When("^User enters {String} {String} {String} {String} {String} clicks {String}$")
	public void testCustomerRegistration(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		//Please fill the Required code
		driver.findElement(By.xpath(xpathCname)).sendKeys(arg1);
		arg1val=arg1;
		driver.findElement(By.xpath(xpathAge)).sendKeys(arg2);
		arg2val=arg2;
		driver.findElement(By.xpath(xpathAddress)).sendKeys(arg3);
		arg3val=arg3;
		driver.findElement(By.xpath(xpathPhonenumber)).sendKeys(arg4);
		arg4val=arg4;
		driver.findElement(By.xpath(xpathEmail)).sendKeys(arg5);
		arg5val=arg5;
		
		driver.findElement(By.xpath(xpathSubmitbutton)).click();
		
	}

	@Then("^user is registered with user details displayed$")
	public void validateResult() throws Throwable {
	    
		
		
		if( driver.findElement(By.xpath(xpathCnamesaved)).getText().equals(arg1val))
		{
			System.out.println("Name correct");
		}
		else {
			System.out.println("Name incorrect");
			throw new Exception("Name incorrect");
		}
		if(driver.findElement(By.xpath(xpathAgesaved)).getText().equals(arg2val)) 
		{
			System.out.println("Age correct");
		}
		else {
			System.out.println("Age incorrect");
			throw new Exception("Age incorrect");
		}
		if( driver.findElement(By.xpath(xpathAddresssaved)).getText().equals(arg3val)) 
		{
			System.out.println("Address correct");
		}
		else {
			System.out.println("Address incorrect");
			throw new Exception("Address incorrect");
		}
		if( driver.findElement(By.xpath(xpathPhonesaved)).getText().equals(arg4val)) 
		{
			System.out.println("Phone correct");
		}
		else {
			System.out.println("Phone incorrect");
			throw new Exception("Phone incorrect");
		}
			
		if(driver.findElement(By.xpath(xpathEmailsaved)).getText().equals(arg5val)) 
		{
			System.out.println("Email correct");
		}
		else {
			System.out.println("Email incorrect");
			throw new Exception("Email incorrect");
		}
	}
	//driver.quit();
	//}

}
