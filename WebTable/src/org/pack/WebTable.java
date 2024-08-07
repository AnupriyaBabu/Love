package org.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\WebTable\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");
			
			WebElement table= driver.findElement(By.tagName("table"));
			WebElement thead= table.findElement(By.tagName("thead"));
			WebElement trow= thead.findElement(By.tagName("tr"));
			List<WebElement> thdata= trow.findElements(By.tagName("th"));
			
			for(int i=0;i<thdata.size();i++) {
			WebElement thdatas=thdata.get(i);
			String text= thdatas.getText();
			System.out.println(text);
		
	}
			
			WebElement tbody= table.findElement(By.tagName("tbody"));
			List<WebElement> tbrow= tbody.findElements(By.tagName("tr"));
			for(int i=0;i<tbrow.size();i++) {
			WebElement tbrows=tbrow.get(i);
			List<WebElement> tbdata= tbrows.findElements(By.tagName("td"));
			for(int j=0;j<tbdata.size();j++) {
				WebElement tbdatas=tbdata.get(j);
				String text=tbdatas.getText();
				System.out.println(text);
}
}
}
}