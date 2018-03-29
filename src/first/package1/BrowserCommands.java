package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	WebDriver driver;

	public void invokebrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("http://www.yatra.com");
           
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
	
		public void closebrowser() {
		try {
			driver.close();
			//driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	

	public static void main(String[] args) {
		BrowserCommands obj=new BrowserCommands();
		obj.invokebrowser();
		obj.closebrowser();
		// TODO Auto-generated method stub

	}
}

