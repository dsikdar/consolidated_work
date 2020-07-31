

package com.junit.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(	
		features={"Features"},
		glue={"com.cucumber.stepdefinition"}
		)

public class CustomerTest {

}
