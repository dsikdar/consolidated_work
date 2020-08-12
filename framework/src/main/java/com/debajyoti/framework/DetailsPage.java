package com.debajyoti.framework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.debajyoti.*;
public class DetailsPage {
	
	WebDriver driver;
	WebElement name;
	WebElement phonenumber;
	DetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	boolean checkEntry(String namevalue , String phonenumbervalue )
	{
		try {
		name=driver.findElement(By.xpath("//td[text()='"+namevalue+"']"));
		phonenumber=driver.findElement(By.xpath("//td[text()='"+phonenumbervalue+"']"));
		}
		catch(Exception e) {
			return false;
		}
		return true;
	}

}
