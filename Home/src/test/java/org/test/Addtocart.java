package org.test;
import org.home.Homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Addtocart extends Homepage {

	public void AddItem () {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement AddItem;
	
	public WebElement getAddItem() {
		return AddItem;
	}
	public void RemoveItem () {
		PageFactory.initElements(driver,this);	
	}
	@FindBys({@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']"),@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")})
	private WebElement RemoveItem;
	
	public WebElement getRemoveItem() {
		return RemoveItem;
        }
}

        
	    
	   
	   	
	    
		
	
	
