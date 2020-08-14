package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String baseUrl = "http://the-internet.herokuapp.com/";
				WebDriver driver = new ChromeDriver();

				System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
				// Maximize the browser's window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(baseUrl);

				Actions act=new Actions(driver);
				WebElement cehcekbox=driver.findElement(By.xpath("//a[text()='Checkboxes']"));
				act.contextClick(cehcekbox).perform();
				Thread.sleep(4000);
				System.out.println("done");
				driver.quit();
	}

}
