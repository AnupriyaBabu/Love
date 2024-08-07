package org.window;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\WindowHandling\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14",Keys.ENTER);
		String parent= driver.getWindowHandle();
		System.out.println("parent window id"+parent);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 (128 GB) - Blue'])[4]")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		Set<String> allwindow= driver.getWindowHandles();
		System.out.println("allwindow id"+allwindow);
		
		for(String s:allwindow) {
			if(!parent.equals(allwindow)) {
				driver.switchTo().window(s);
			}
		}
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.findElement(By.id("buy-now-button")).click();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[2]")).click();
		Set<String> allwindow2 = driver.getWindowHandles();
		System.out.println("allwindow2 id2"+allwindow2);
		
		
	     List<String> li = new ArrayList(allwindow2);
		 String c=li.get(2);
		 
		driver.switchTo().window(c);
		driver.findElement(By.id("buy-now-button")).click();
		
		
}
	

}
