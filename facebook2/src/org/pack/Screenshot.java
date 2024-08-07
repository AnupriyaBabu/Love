package org.pack;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException,AWTException,InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\venki\\eclipse-workspace\\facebook2\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File ScreenshotAs= ts.getScreenshotAs(OutputType.FILE);
		System.out.println(ScreenshotAs);
		
		FileUtils.copyFile(ScreenshotAs,new File("C:\\Users\\venki\\eclipse-workspace\\facebook2\\lib\\commons-io-2.6.jar"));
       
}
}
