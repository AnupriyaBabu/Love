package org.site;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor  {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\JavascriptExecutor\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		//Down
		WebElement down = driver.findElement(By.xpath("//button[text()='Check this']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down );
		
		Thread.sleep(2000);
		
		
		/*//Up
		WebElement up = driver.findElement(By.id("drop1"));
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		
		
		//click
		WebElement click = driver.findElement(By.id("but2"));
		js.executeScript("arguments[0].click()",click);*/		
		
	}
			
	}	
	

	
		
	

