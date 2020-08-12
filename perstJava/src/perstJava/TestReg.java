package perstJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestReg {

	static String xpathUserName = "//input[@id='id-username']";
	static String xpathPassword = "//input[@id='id-password1']";
	static String xpathconfirmPassword = "//input[@id='id-password2']";
	static String xpathSubmitButton="//input[@type='submit']";
	static String entereduserName;
	static WebDriver driver;
	static WebElement userName;
	static WebElement password;
	static WebElement confirmPassword;
	static WebElement submitButtoon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "E://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/reg.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		buildWebElements();
		enterUserName("debajyoti");
		enterPassword("abcd");
		enterConfirmPassword("abcd");
		register();
		
	}

	public static void buildWebElements() {
		userName=driver.findElement(By.xpath(xpathUserName));
		password=driver.findElement(By.xpath(xpathPassword));
		confirmPassword=driver.findElement(By.xpath(xpathconfirmPassword));
		submitButtoon=driver.findElement(By.xpath(xpathSubmitButton));
	}
	
	public static void enterUserName(String userNameValue) {
		userName.sendKeys(userNameValue);
		entereduserName=userName.getAttribute("value");
		
		
	}
	public static void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
		
	}
	public static void enterConfirmPassword(String confirmPasswordValue) {
		confirmPassword.sendKeys(confirmPasswordValue);
	}
	public static void register() {
		submitButtoon.click();
	}
	public void checkValidRegistrationMessage() {
		//String userNameinSuccessfulregForm=driver.findElement(By.xpath("//span[@class='username']")).getText();
		
	}

}
