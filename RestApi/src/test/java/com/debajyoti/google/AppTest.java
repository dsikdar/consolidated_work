package com.debajyoti.google;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers;
import static io.restassured.RestAssured.given;

public class AppTest {

	RestAssured y = new RestAssured();

	@Test
	public void GetWeatherDetails() {
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://debajyotisikdar.com";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method
		// URL.
		// This will return the Response from the server. Store the response in a
		// variable.
		Response response = httpRequest.request(Method.GET, "/");

		// Now let us print the body of the message to see what response
		// we have recieved from the server

		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/");

		String responseBody = response.getBody().asString();

		System.out.println("Response Body is =>  " + responseBody);
		
		
		Given(). 
        param("x", "y"). 
        header("z", "w").
when().
Method().
Then(). 
        statusCode(XXX).
        body("x, ”y", equalTo("z"));

	}

}