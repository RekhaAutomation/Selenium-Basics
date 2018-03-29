package com.excel.poi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.*;

public class DatadrivenTest {
	

	public static void main(String[] args) {
		
        
       
		Xls_Reader reader=new Xls_Reader("C:\\Users\\ganib\\eclipse-workspace\\newproject\\src\\com\\testdata\\Ebaytestdata.xlsx");
				
	String firstName=reader.getCellData("RegTestData","Firstname", 2);
		System.out.println(firstName);
		String lastName=reader.getCellData("RegTestData","Lastname", 2);
		System.out.println(lastName);
		String mailid=reader.getCellData("RegTestData","Emailaddres", 2);
		System.out.println(mailid);
		String pwd=reader.getCellData("RegTestData","password", 2);
		System.out.println(pwd);
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
        driver.findElement(By.id("firstname")).sendKeys(firstName);
        driver.findElement(By.id("lastname")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(mailid);
        driver.findElement(By.id("PASSWORD")).sendKeys(pwd);
        
		
		// TODO Auto-generated method stub

	}

}
