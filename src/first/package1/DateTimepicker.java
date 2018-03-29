package first.package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimepicker {
	WebDriver driver;
	WebElement wed;
	public void invokebrowser() {
		try {
			
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/selenium");
			dateandtime();
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dateandtime() {
	 wed=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
	wed.sendKeys("12212017");
	wed.sendKeys(Keys.TAB);
	wed.sendKeys("0615PM");
		
	}

	public static void main(String[] args) {
		DateTimepicker dtp=new DateTimepicker();
		dtp.invokebrowser();
		
		

	}

}
