package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com")
public class Homepage extends PageObject{
	
	WebDriver navegador;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnSignIn;
	
	public void writeData(String usuario, String contrasena) {
		txtUserName.sendKeys(usuario);
		txtPassword.sendKeys(contrasena);
	}
	
	public void sendData() {
		btnSignIn.click();
	}
	
}
