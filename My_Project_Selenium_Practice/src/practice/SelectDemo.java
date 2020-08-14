package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String baseUrl = "https://letskodeit.teachable.com/p/practice";
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);

		Select sel = new Select(driver.findElement(By.id("multiple-select-example")));
		System.out.println("Is it multi select ? "+sel.isMultiple());
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.deselectByVisibleText("Peach");
		Thread.sleep(1000);
		sel.selectByValue("orange");
		Thread.sleep(1000);
		List<WebElement> selectedoptions=sel.getAllSelectedOptions();
		for(WebElement option:selectedoptions) {
			System.out.println("Selected option "+option.getText());
		}
		Thread.sleep(1000);
		sel.deselectAll();
		System.out.println("done");
	}
}
