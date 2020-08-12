package com.debajyoti.rest;
import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class debuhomepage {

	   final static String url="https://debajyotisikdar.com";

	public static void printHomePage(){
		    given().when().get("https://debajyotisikdar.com/").then().log().body();
		   //System.out.println("The response status is "+statusCode);

		  
		}
	public static void printStatusCodeInvalid() {
		System.out.println("Non existent page -status code :"+given().when().get("https://debajyotisikdar.com/nopage").getStatusCode());
	}
	public static void printStatusCode() {
		System.out.println("Existent page -status code :"+given().when().get("https://debajyotisikdar.com").getStatusCode());
	}
	public static void createDummydata() {
		
		 
		
		given().formParam("name","einstein albert").formParam("phoneumber","9990").when().post("https://debajyotisikdar.com/supersecret.php").then().log().all();        
	}
	public static void printAllContacts() {
		given().when().get("https://debajyotisikdar.com/supersecret.php").then().log().all();
	}
	public static void main(String args[]) {
		printHomePage();
		System.out.println("###################################################");
		printStatusCodeInvalid();
		System.out.println("###################################################");
		printStatusCode();
		System.out.println("###################################################");
		createDummydata();
		System.out.println("###################################################");
		printAllContacts();
	}
}
