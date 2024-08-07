package org.pack;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestScript extends BaseClass {

	public static void main(String[]args) throws IOException {
		BaseClass base = new BaseClass();
		base.getDriver();
		base.getUrl("https://www.facebook.com/");
		base.screenCapture("HomePage");
		WebElement username = driver.findElement(By.id("email"));
		//base.textSend(username, "jack78654@gmail.com");
		username.sendKeys(base.readExcel(1,0));
		base.screenCapture("User");	
	}

}
