package hellocucumber;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Then;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import hellocucumber.Hooks;

public class Stepdefs {

   

	@Given("The User provide details as")
	public void the_User_provide_details_as(DataTable dataTable) {
	    System.out.println("Name "+ dataTable.asList().get(0));
	    System.out.println("Password "+ dataTable.asList().get(1));
	    System.out.println("Country "+ dataTable.asList().get(2));
	    System.out.println("email "+ dataTable.asList().get(3));
	}

	@Then("Clicks on Submit button")
	public void clicks_on_Submit_button() {
	    
	    throw new cucumber.api.PendingException();
	}

	@Then("The User shown a sign-up succesful msg")
	public void the_User_shown_a_sign_up_succesful_msg() {
	  
	    throw new cucumber.api.PendingException();
	}
   

    @When("^The User Logs In$")
    public void theUserLogsIn() throws Exception {
        System.out.println("User logged in");
       
    }
    
    @Given("The User logs in with {string} and {string}")
    public void the_User_logs_in_with_and(String string, String string2) {
        
        System.out.println(" User Name "+string + "Password "+string2);
    }

    @Then("Login should be successful")
    public void login_should_be_successful() {
        
        System.out.println("Succefful login");
    }

    @Then("Login should not be successful")
    public void login_should_not_be_successful() {
      
        System.out.println("Login unsuccessful");
    }
    
    @Then("I print all User {int} and Password{int}")
    public void i_print_all_User_and_Password(Integer int1, Integer int2) {
        
        System.out.println("userName "+int1 + "password "+int2 );
    }
    
    @Given("system is up")
    public void system_is_up() {
       System.out.println("System is up");
    }

}