package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://www.google.com";
		WebDriver driver = new ChromeDriver();;
		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");;
		
		List<WebElement> suggestions=driver.findElements(By.xpath("//li//b"));
		for(WebElement suggestion : suggestions) {
			if (suggestion.getText().contains("interview questions"))
			{
				suggestion.click();
			}
			
		}
		Thread.sleep(2000);
		driver.quit();
		System.out.println("done");
	}

}
