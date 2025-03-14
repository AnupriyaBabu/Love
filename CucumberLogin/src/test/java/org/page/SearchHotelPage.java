package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//td[text()='Search Hotel ']")
	private WebElement searchHotel;
	
	public WebElement getSearchHotel() {
		return searchHotel;
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
}



