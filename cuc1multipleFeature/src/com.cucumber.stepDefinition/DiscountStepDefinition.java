package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;

import cucumber.api.java.en.*;


public class DiscountStepDefinition {

	WebDriver driver;
	String text;


	@Given("^User loads the application and navigate to DATAX shipping company home$")
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
    	FirefoxBinary firefoxBinary = new FirefoxBinary();
    	firefoxBinary.addCommandLineOptions("--headless");
        FirefoxProfile profile=new FirefoxProfile();
    	FirefoxOptions firefoxOptions = new FirefoxOptions();
    	firefoxOptions.setBinary(firefoxBinary);
    	firefoxOptions.setProfile(profile);
        driver=new FirefoxDriver(firefoxOptions);
		driver.get("https://webapps.tekstac.com/CompanyOffersDiscount/");
		System.out.println("Application is launched");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" on Company Offers Discount page$")
	public void testDiscount(String weight, String distance) {	
	    //Please fill the required codes
	}

	@Then("^The text \"([^\"]*)\" should be displayed$")
	public void validateResult(String Message) {
		//Please fill the required codes
		driver.quit();
	}

}


