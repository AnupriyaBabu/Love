package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	private WebElement userName;

	// private WebElement userName = driver.findElement(By.xpath("//input[@id='password']"));

	public WebElement getUserName() {
		return userName;
	}

	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
}



