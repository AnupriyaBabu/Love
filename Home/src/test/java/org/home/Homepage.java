package org.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage {
	
		
		public static WebDriver driver;
		
		public void getDriver() {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
			
			 public void getUrl(String url) {
				driver.get(url);
			
		}
			
}
	
