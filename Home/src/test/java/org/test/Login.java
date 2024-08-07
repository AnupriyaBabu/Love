package org.test;

import org.home.Homepage;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends Homepage {
	
	public Login() {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(id="user-name")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	


	
	
	
	
	
	/*public void Loginpage() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	 //Add to Cart
    driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
	// Vailated the Add Cart Item
	driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
	//Remove the 2 Cart Item
	driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']")).click();
	driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
	//CheckOut
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	driver.findElement(By.id("first-name")).sendKeys("Anu");
	driver.findElement(By.id("last-name")).sendKeys("Priya");
	driver.findElement(By.id("postal-code")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//button[@id='finish']")).click();
	driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
	//Logout Page
	 driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();*/

	



	}

