package com.debajyoti.rest;

import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
public class myFirstRestAssuredClass {

   final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

   public static void main(String args[]) {

    // getResponseBody();
    // getResponseStatus();
	 //  getResponseHeaders();
	   getDetailsofContents();

; }

   //This will fetch the response body as is and log it. given and when are optional here
   public static void getResponseBody(){
       given().when().get(url).then().log()
      .all();

  given().queryParam("CUSTOMER_ID","68195")
               .queryParam("PASSWORD","1234!")
               .queryParam("Account_No","1") .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();
   }

public static void getResponseStatus(){
   int statusCode= given().queryParam("CUSTOMER_ID","68195")
           .queryParam("PASSWORD","1234!")
           .queryParam("Account_No","1")
           .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
   System.out.println("The response status is "+statusCode);

   given().when().get(url).then().assertThat().statusCode(200);
}

public static void getResponseHeaders() {
	/*System.out.println(given().queryParam("CUSTOMER_ID","68195")
    .queryParam("PASSWORD","1234!")
    .queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").getHeaders().asList().get(0).toString());*/
	
	/*System.out.println(given().queryParam("CUSTOMER_ID","68195")
		    .queryParam("PASSWORD","1234!")
		    .queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").getHeaders().toString());
	System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
	
	System.out.println(given().queryParam("CUSTOMER_ID","68195")
    .queryParam("PASSWORD","1234!")
    .queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").getHeader("Keep-Alive"));

System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");*/
	
	/*System.out.println(given().queryParam("CUSTOMER_ID","68195")
    .queryParam("PASSWORD","1234!")
    .queryParam("Account_No","1").when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().headers());
*/

}
public static void getDetailsofContents() {
	//String[] amounts = when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().extract().jsonPath().get("result.statements.AMOUNT");
	ArrayList<String> logins = when().get("https://api.github.com/users/hadley/orgs").then().extract().jsonPath().get("login");
	for(String login:logins) {
		System.out.println(login);
	}

	   // System.out.println("The amount value fetched is "+amounts);
	    
	
	
}


}