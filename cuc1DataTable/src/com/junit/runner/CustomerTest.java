

package com.junit.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
features = {"src/Features"},
tags= {"@L1, @L2"},
glue= {"com.cucumber.stepdefinition"}

)

public class CustomerTest {

}
