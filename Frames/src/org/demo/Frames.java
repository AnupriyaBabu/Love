package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\Frames\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1234");
		driver.switchTo().parentFrame();
		driver.navigate().refresh();
		
		
		

				

}
}
