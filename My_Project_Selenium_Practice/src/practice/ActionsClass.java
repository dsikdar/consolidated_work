package practice;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String choice = "autocomplete";

		try {
			String baseUrl = "http://the-internet.herokuapp.com/drag_and_drop";
			driver = new ChromeDriver();
			;
			System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
			// Maximize the browser's window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(baseUrl);

			switch (choice) {
			case "actions":
				WebElement draggable = driver.findElement(By.xpath("//div[@id='column-a']"));
				WebElement droppable = driver.findElement(By.xpath("//div[@id='column-b']"));

				Actions act = new Actions(driver);
				act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();

				Thread.sleep(3000);
				System.out.println("Drga drop done");
			}

			
		} catch (Exception E) {
			System.out.println(E.getMessage());
			driver.quit();
		}
	}

}
