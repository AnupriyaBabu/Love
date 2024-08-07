package org.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook {

 public static void main(String[] args) {
			
	             System.setProperty("webdriver.chrome.driver", "C:\\Users\\venki\\eclipse-workspace\\Facebook\\Driver\\chromedriver.exe");
				
				//initialize the webdriver
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				WebElement user= driver.findElement(By.id("email"));
				user.sendKeys("Venki");
				
				WebElement pass= driver.findElement(By.name("pass"));
				pass.sendKeys("123456");
				
				WebElement button= driver.findElement(By.name("login"));
				button.click();
				
				WebElement txt= driver.findElement(By.tagName("h2"));
				String text=txt.getText();
				System.out.println(text);
				
				WebElement linktxt= driver.findElement(By.linkText("Forgotten password?"));
				String text1=linktxt.getText();
				System.out.println(text1);
				
				
				WebElement plinktxt= driver.findElement(By.partialLinkText("Forgotten "));
				String text2=plinktxt.getText();
				System.out.println(text2);
				
				
			}
}
