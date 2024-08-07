package org.page;


import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	public  WebElement getUsername() {
		return username;
		
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement password; 
	
	public  WebElement getPassword() {
		return password;
		
	}
	@FindBy(xpath="//input[@id='login']")
	private WebElement login; 

	public  WebElement getLogin() {
		return login;
			
	}

}
