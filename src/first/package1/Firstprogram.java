package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Firstprogram {
	WebDriver driver;
	
	public static void main(String[] args)  { 
		try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");		
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("http://www.edureka.co/all-courses");
			driver.findElement(By.id("search-inp")).sendKeys("java");
			  Thread.sleep(3000);
			  driver.findElement(By.id("search-button-top")).click();
			  JavascriptExecutor jse= (JavascriptExecutor)driver;
			  jse.executeScript("scroll(0,5000)");
			 // jse.executeScript(window.scrollBy("(0,5000)"));
			 driver.quit();
			  						
		} catch (Exception e) {
						e.printStackTrace();
						
		}	
		
		
	}
		
		
	}


