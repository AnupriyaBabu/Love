package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	public void getUrl(String Url) {
		driver.get(Url);
		
	}
	public void textSend(WebElement element,String keysTosend) {
		element.sendKeys(keysTosend);
	}
	public void alert(String type) {
		Alert alert=driver.switchTo().alert();
		switch(type) {
		case "Accept":
			alert.accept();
			break;
		case "Dismiss":
			alert.dismiss();
			break;
			default:
				break;
		}
	}

	public void screenCapture(String name)throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\venki"+name+".png");
		FileUtils.copyFile(source, target);
	}
		
	public String readExcel(int rownum, int cellnum)throws IOException {
		File file=new File("");
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet=book.getSheet("Sheet1");
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(cellnum);
		CellType cellType=cell.getCellType();
		String value=null;
		switch (cellType) {
		case STRING:
			value=cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue=cell.getDateCellValue();
				SimpleDateFormat simple=new SimpleDateFormat("dd/MM/yyy");
				value=simple.format(dateCellValue);
			
			}
			else {
				double numericCellValue=cell.getNumericCellValue();
				BigDecimal valueOf=BigDecimal.valueOf(numericCellValue);
				value=valueOf.toString();
			}
			break;
			default:
				System.out.println("Un Defined Format");
				break;
				
		}
		return value;
	}
	public String getWindowsId(int index) {
		String parentWindowsID=driver.getWindowHandle();
		Set<String>allWindowsID=driver.getWindowHandles();
		List<String>li=new LinkedList<String>();
		//To add all the windowsID to this List
		li.addAll(allWindowsID);
		//To get Particular value based on Index
		String childWindowID=li.get(index);
		return  childWindowID;
	}

	public void selectByValue(WebElement location, CharSequence readExcel) {
		// TODO Auto-generated method stub
		
	}

}
