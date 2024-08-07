package org.login;

import org.openqa.selenium.Alert;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException { //throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\Facebooks\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement user= driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("AnupriyaVenkat");
		
		//Robot r= new Robot();
		//r.keyPress(KeyEvent.VK_SHIFT);
		//r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_SHIFT);
		//r.keyRelease(KeyEvent.VK_A);
		
		WebElement Pwd= driver.findElement(By.xpath("//input[@name='password']"));
		Pwd.sendKeys("090909");
		
		WebElement login= driver.findElement(By.xpath("//input[@value=\'Login\']"));
		login.click();
		
		/*WebElement box=driver.findElement(By.id("location"));
		Select s=new Select(box);
		s.selectByIndex(5);
		s.selectByValue("London");
		s.selectByVisibleText("Paris");
		
		WebElement box1=driver.findElement(By.id("hotels"));
		Select s1=new Select(box1);
		s1.selectByIndex(4);
		s1.selectByValue("Hotel Sunshine");
		s1.selectByVisibleText("Hotel Hervey");
		
		WebElement box2=driver.findElement(By.id("room_type"));
		Select s2=new Select(box2);
		s2.selectByIndex(3);
		s2.selectByValue("Standard");
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement box3=driver.findElement(By.id("room_nos"));
		Select s3=new Select(box3);
		s3.selectByIndex(8);
		s3.selectByValue("6");
		
		WebElement box4=driver.findElement(By.id("adult_room"));
		Select s4=new Select(box4);
		s4.selectByIndex(3);
		s4.selectByValue("3");
	
		WebElement box5=driver.findElement(By.id("child_room"));
		Select s5=new Select(box5);
		s5.selectByIndex(4);
		s5.selectByValue("2");
		
		WebElement button= driver.findElement(By.name("Submit"));
		button.click();
		
		WebElement rbutton= driver.findElement(By.id("radiobutton_0"));
		rbutton.click();
		
		WebElement btn= driver.findElement(By.name("continue"));
		btn.click();
		
		WebElement name= driver.findElement(By.name("first_name"));
		name.sendKeys("Anu");
		
		WebElement n= driver.findElement(By.id("last_name"));
		n.sendKeys("Priya");
		
		WebElement add= driver.findElement(By.id("address"));
		add.sendKeys("Kovai");
		
		WebElement pin= driver.findElement(By.name("cc_num"));
		pin.sendKeys("6790431567422679");
		
		WebElement box6 = driver.findElement(By.id("cc_type"));
		Select s6=new Select(box6);
		s6.selectByIndex(4);
		s6.selectByValue("VISA");
		
		WebElement box7 = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(box7);
		s7.selectByIndex(12);
		s7.selectByValue("6");
		s7.selectByVisibleText("April");
		
		WebElement box8 = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(box8);
		s8.selectByIndex(10);
		s8.selectByValue("2027");
		
		WebElement d = driver.findElement(By.name("cc_cvv"));
		d.sendKeys("584");
		
		WebElement click= driver.findElement(By.name("book_now"));
		click.click();
		
		Thread.sleep(5000);
		
		WebElement select= driver.findElement(By.id("my_itinerary"));
		select.click();
		
		WebElement demo= driver.findElement(By.name("ids[]"));
		demo.click();
	
		WebElement search= driver.findElement(By.id("order_id_text"));
		search.sendKeys("11OF7BFIS4");
		
		WebElement go= driver.findElement(By.id("search_hotel_id"));
		go.click();
		
		WebElement out= driver.findElement(By.id("logout"));
		out.click();*/
		
		driver.get("https://adactinhotelapp.com/BookedItinerary.php");
		
		WebElement First=driver.findElement(By.xpath("//input[@class='reg_button']"));
		First.click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		
		WebElement Second = driver.findElement(By.xpath("//input[@value='Cancel Selected']"));
		Second.click();
		Alert a2 = driver.switchTo().alert();
		Thread.sleep(5000);
		a2.dismiss();
		
		WebElement Thrid= driver.findElement(By.xpath("//input[@name='logout']"));
		Thrid.click();
		Alert a3= driver.switchTo().alert();
		Thread.sleep(5000);
		a3.accept();	
		
	}
	

}
