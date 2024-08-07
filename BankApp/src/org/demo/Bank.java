package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bank {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\BankApp\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		/*driver.get("https://www.facebook.com/");
		
		WebElement Pass=driver.findElement(By.id("pass"));
		
		a.click(Pass).perform();
		a.contextClick(Pass).perform();
		
		driver.get("https://omayo.blogspot.com/");
		
		
		WebElement move = driver.findElement(By.xpath("//button[text()='Check this']"));
		a.moveToElement(move).perform();
		
		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double click Here'] "));
		a.doubleClick(dclick).perform();*/
		
		
	  driver.get("https://www.demo.guru99.com/test/drag_drop.html");
	  
	  WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	  WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	  a.dragAndDrop(source, target).perform();
	   
	  
	  WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	  WebElement dpt = driver.findElement(By.xpath("(//*[@id='amt7'])"));
	  a.dragAndDrop(amt, dpt).perform();
	  
	  WebElement com= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	  WebElement tom= driver.findElement(By.xpath("(//*[@id='loan']/li)"));
	  a.dragAndDrop(com, tom).perform();
	  
	  WebElement top = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	  WebElement Cap = driver.findElement(By.xpath("(//*[@id='amt8']/li)"));
	  a.dragAndDrop(top, Cap).perform();
		
	}

}
