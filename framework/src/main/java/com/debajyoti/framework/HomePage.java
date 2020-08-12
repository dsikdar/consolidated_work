package com.debajyoti.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	@FindBy(id="name")
	WebElement nameField;
	
	@FindBy(id="phonenumber")
	WebElement phonenumber ;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement formSubmitButton;
	
	HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	 
	public void setname(String name) {
		nameField.clear();
		nameField.sendKeys(name);
	}
	public void setPhoneNumber(String phonenumber) {
		//nameField.sendKeys(phonenumber.toString());
		this.phonenumber.clear();
		this.phonenumber.sendKeys(""+phonenumber);
	}
	public void clickOnSubmit() {
		formSubmitButton.click();
	}
}
