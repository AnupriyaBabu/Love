package org.log;
import org.home.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Logout extends Homepage{
	
	public void CheckOut() {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement CheckOut;
	
	public WebElement getCheckOut() {
		return CheckOut;
	}
	@FindBy(id="first-name")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(id="last-name")
	private WebElement lastname;
	
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(id="postal-code")
	private WebElement postalcode;
	
	public WebElement getPostalcode() {
		return postalcode;
	}
    
    @FindBy(xpath="//button[@id='react-burger-menu-btn']")
       private WebElement menubtn;
	
	  public WebElement getMenubtn() {
		return menubtn;
	}
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	    private WebElement logout;
	
		public WebElement getLogout() {
			return logout;
		}

}
