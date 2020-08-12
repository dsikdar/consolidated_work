package com.debajyoti.framework;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TestHomePage extends BaseClass{
  @Test(priority=1,dataProvider="provideUserNamePhoneNumber",dataProviderClass=BaseClass.class)
  public void testHomePage(String name , String phonenumber) throws Exception {
	  HomePage homePage=new HomePage(driver);
	  test=report.startTest("Testing Home Page "+"name "+name+"phonenumber "+phonenumber);
	  //final Logger logger = Logger.getLogger(TestHomePage.class);
	  //logger.info("Homepage test statred");
	  System.out.println("Testing Home Class");
	  test.log(LogStatus.PASS, "Reached Homepage");
	  test.log(LogStatus.PASS, "Checking homepage");
	  System.out.println(name+" "+phonenumber);
	  homePage.setname(name);
	  homePage.setPhoneNumber(phonenumber);
	  testStepaddScreenshot(ITestResult.SUCCESS);
	  homePage.clickOnSubmit();
	  driver.navigate().back();
	  report.endTest(test);
	  
	  
	  
  }
  @Test(priority=2)
  public void testDetailsPage() throws Exception {
	  test=report.startTest("Testing Details Page");
	  //final Logger logger = Logger.getLogger(TestHomePage.class);
	  //logger.info("Homepage test statred");
	  System.out.println("Testing Details Class");
	  test.log(LogStatus.PASS, "Reached Details page");
	  testStepaddScreenshot(ITestResult.SUCCESS);
	  test.log(LogStatus.PASS, "Checking Details Page");
	  testStepaddScreenshot(ITestResult.SUCCESS);
	  report.endTest(test);
	  
	  
  }
 
  
}
