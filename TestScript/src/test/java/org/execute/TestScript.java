package org.execute;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.SelectHotelPage;

public class TestScript extends BaseClass {
	public static void main(String[] args) {
		BaseClass base=new BaseClass();
		base.getDriver();
		base.getUrl("http://adactinhotelapp.com/");
		base.screenCapture("HomePage");
		WebElement username=loginPage.getUsername();
		username.sendKeys(base.readExcel(1,0));
		WebElement password=loginPage.getPassword();
		password.sendKeys(base.readExcel(1,1));
		WebElement login=loginPage.getLogin();
		login.click();
		SelectHotelPage searchHotel=new SelectHotelPage();
		WebElement location=searchHotel.getLocation();
		base.selectByValue(location,base.readExcel(1,4));
		
		
	}

}
