package com.debajyoti.rest;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import io.restassured.RestAssured.*;
import io.restassured.http.Header;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
public class RestApiPractice {

 

  @Test(enabled=false)
  void check() {
	  given()
	   .get("https://postman-echo.com/")
	   .then()
	   .assertThat()
	   .statusCode(200)
	   .and()
	   .header("server","nginx");///assert status code and heade
	   	
	   
  }
	  
	  @Test(enabled=false)
	  void f() {
	  List<Header> headers=given()
	  .when()
	  .get("https://postman-echo.com/")
	  .getHeaders().asList();
	  
	  for(Header h : headers) {
		  System.out.println(h.getName()+" "+h.getValue());// get headers
	  }
	  
	  }
	  @Test(enabled=false)
	  void fg() {
		  ArrayList<String> logins=
		  given()
		  .when()
		  .get("https://api.github.com/users/hadley/orgs")
		  .then()
		  .extract()
		  .jsonPath()
		  .get("login");
		  
		  for(String login:logins) {
				System.out.println(login);//get data from json response body
			}
	  }
	  @Test
		public void validateResponseBody() {
		  given().
		  get("https://api.github.com/users/hadley/orgs").
		  then().
		  assertThat().
		  body("id[0]", equalTo(423638));
		  //validate json body element

		}
	
}
