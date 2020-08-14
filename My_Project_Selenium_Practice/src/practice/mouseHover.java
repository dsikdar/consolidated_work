package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouseHover {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://letskodeit.teachable.com/p/practice";
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);

		WebElement mouseHoverButton=driver.findElement(By.xpath("//button[@id='mousehover']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", mouseHoverButton);
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, -100);");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(mouseHoverButton).perform();
		Thread.sleep(1000);
		WebElement topoption=driver.findElement(By.xpath("//a[text()='Top']"));
		topoption.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
