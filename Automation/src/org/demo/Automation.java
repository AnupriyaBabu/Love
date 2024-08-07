package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Index.html");
		
		WebElement btn = driver.findElement(By.cssSelector("img#enterimg"));
		btn.click();
		
		WebElement FristName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		FristName.sendKeys("AnuPriya");
		
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys("Venkatesh");
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		Address.sendKeys("Trichy");
		
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Nature@gmail.com");
		
		WebElement PhNo= driver.findElement(By.xpath("//input[@type='tel']"));
		PhNo.sendKeys("9876541230");
		
		WebElement Gender= driver.findElement(By.xpath("//input[@value='FeMale']"));
		Gender.click();
		
		WebElement Hobbies= driver.findElement(By.xpath("//input[@value='Movies']"));
		Hobbies.click();
		
		WebElement Pwd= driver.findElement(By.xpath("//input[@type='password']"));
		Pwd.sendKeys("1234");
		
		WebElement CPwd= driver.findElement(By.xpath("//input[@id='secondpassword']"));
		CPwd.sendKeys("1234");
	
	}

}