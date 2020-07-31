package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
	
	features="src/test/java/feature",
	glue="stepDefinitions"
)

public class TestRunner {

	
	
}
