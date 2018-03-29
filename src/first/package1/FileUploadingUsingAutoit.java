package first.package1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingUsingAutoit {
	
	public static void main(String[] args) throws IOException { 
		WebDriver driver;
		WebElement browser;
	
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
			driver.findElement(By.id("uploadfile")).click();
			
			
		browser=(WebElement) Runtime.getRuntime().exec("C:\\Users\\ganib\\OneDrive\\Documents\\UploadFile.exe");
		browser.click();
		
			driver.close();
		} 
						
		
	
	
	

}
//\Program Files (x86)\AutoIt3\SciTE\..\aut2exe\aut2exe.exe
//C:\Users\ganib\OneDrive\Documents
//C:\Program Files (x86)\AutoIt3\UploadFile.exe
//C:\Users\ganib\OneDrive\Documents