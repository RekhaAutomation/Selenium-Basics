package com.excel.poi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DatadrivenusingForloop {
	
	
			
	public static void main(String[] args) {
		Xls_Reader reader=new Xls_Reader("C:\\Users\\ganib\\eclipse-workspace\\newproject\\src\\com\\testdata\\Ebaytestdata.xlsx");
		int rowCount=reader.getRowCount("RegTestData");
		reader.addColumn("RegTestData", "Status");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");	
        //insert data in for loop
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
		String firstName=reader.getCellData("RegTestData","Firstname", rowNum);
			System.out.println(firstName);
			String lastName=reader.getCellData("RegTestData","Lastname", rowNum);
			System.out.println(lastName);
			String mailid=reader.getCellData("RegTestData","Emailaddres", rowNum);
			System.out.println(mailid);
			String pwd=reader.getCellData("RegTestData","password", rowNum);
			System.out.println(pwd);
		
	//webdriver code
			 driver.findElement(By.id("firstname")).clear();
	        driver.findElement(By.id("firstname")).sendKeys(firstName);
	        driver.findElement(By.id("lastname")).clear();
	        driver.findElement(By.id("lastname")).sendKeys(lastName);
	        driver.findElement(By.id("email")).clear();
	        driver.findElement(By.id("email")).sendKeys(mailid);
	        driver.findElement(By.id("PASSWORD")).clear();
	        driver.findElement(By.id("PASSWORD")).sendKeys(pwd);
	        //adding colomn
	        reader.setCellData("RegTestData", "Status", rowNum,"Pass");

			
	}
		driver.close();
}
}
	
	
	
	
	
	
	
