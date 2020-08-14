package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class switchTab {

	public static void main(String[] args) {
		try { // TODO Auto-generated method stub
			String baseUrl = "https://letskodeit.teachable.com/p/practice";
			WebDriver driver = new ChromeDriver();

			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			// Maximize the browser's window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);
			String parentTabHandle = driver.getWindowHandle();
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			Set<String> allHandles = driver.getWindowHandles();

			//

			for (String handle : allHandles) {

				System.out.println(handle);
				if (!handle.equals(parentTabHandle)) {
					System.out.println("handle :"+handle);
					System.out.println("parent handle :"+parentTabHandle);
					driver.switchTo().window(handle);
					break;
				}
			}
			driver.findElement(By.xpath("//input[@id='search-courses']")).sendKeys("cucucucucu");
			Thread.sleep(2000);
			// driver.close();
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
