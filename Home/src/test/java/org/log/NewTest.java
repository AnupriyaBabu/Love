package org.log;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.io.IOException;
import org.home.Homepage;
import org.openqa.selenium.WebElement;
import org.test.Addtocart;
import org.test.Login;

@Test
public class NewTest extends Homepage{
	  public static Homepage home=new Homepage();
	    public static Login login=new Login();
	    public static Addtocart add=new Addtocart();
	    

  @Test(priority=1)
	 private void BrowserLaunch() {
	    	home.getDriver();
	    }
  @Test(priority=2)
	    private void LaunchUrl()throws IOException {
	    	home.getUrl("https://www.saucedemo.com/");
	    }
  @Test(priority=3)
	    private void EnterValidCrendentials()throws IOException {
	    	login =new Login();
	    	WebElement username=login.getUsername();
	    	username.sendKeys("standard_user");
	    	WebElement password=login.getPassword();
	    	password.sendKeys("secret_sauce");
	    	WebElement Login=login.getLogin();
	        Login.click();
	    }
	     
  @Test(priority=4)
	    public void AddItem() throws InterruptedException{
	    	add=new Addtocart();
	    WebElement Addtocart=add.getAddItem();
	    Addtocart.click();
  }
       @Test(priority=5)
      public void RemoveItem() throws InterruptedException{
  	       add=new Addtocart();
  	
	    	WebElement Addtocart=add.getRemoveItem();
	    	Addtocart.click();
	    }
	    	
     @AfterTest
     public void CheckOut() {
    	 
     }
  }

