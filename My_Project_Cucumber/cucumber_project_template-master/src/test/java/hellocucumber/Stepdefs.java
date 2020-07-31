package hellocucumber;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs {

    private WebDriver browser;
    private String search_string = "Price of lord of the rings book";
    private String comparing_string = "Lord of the Rings";

    @Given("^The web browser is opened on google home page$")
    public void startBrowserWithGooglePage() throws Exception {
        // Get the browser
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();

        // Set the browser home page
        browser.get("http://www.google.com");

        // Verify home page
        String pageTitle = browser.getTitle();
        Boolean pageTitleIsOk = pageTitle.equals("Google");
        assertTrue(pageTitleIsOk);

    }

    @When("^The user inserts a text sentence in search input element$")
    public void searchTextInGoogle() throws Exception {
        // search a text sentence in google search input field
        WebElement searchField = browser.findElement(By.name("q"));
        searchField.sendKeys(search_string);
        TimeUnit.SECONDS.sleep(1);
        searchField.sendKeys(Keys.ENTER);
        // wait
        TimeUnit.SECONDS.sleep(3);
    }

    @Then("^The google homepage shows searching results$")
    public void verifyGoogleSearchResults() throws Exception {

        // Get results elements from search page
        List<WebElement> foundElements = browser.findElements(By.className("LC20lb"));

        // Verify if a result element in found elements contains the comparing_string
        int element_position = -1;
        WebElement elem;
        boolean searchResult_ok = false;
        int max_size = foundElements.size() - 1;

        while (searchResult_ok == false && element_position < max_size) {
            // check element against comparing_string
            element_position++;
            elem = foundElements.get(element_position);
            searchResult_ok = elem.getText().contains(comparing_string);
        }

        try {
            assertTrue(searchResult_ok);
        }
        catch (AssertionError e) {
            browser.quit();
            throw new AssertionError("search result verification failed.");
        }

        // Quit the browser
        TimeUnit.SECONDS.sleep(1);
        if (browser != null) browser.quit();
    }

}