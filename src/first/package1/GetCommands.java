package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands { 
 WebDriver driver;
 
	public void invokebrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			getCommands();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public void getCommands() {
		
		driver.get("http://www.amazon.in");
        String titleofthepage=driver.getTitle();
        System.out.println("Title Of The Page Is:"+titleofthepage);
        driver.findElement(By.linkText("Today's Deals")).click();
        String currenturl=driver.getCurrentUrl();
        System.out.println("The current url of the page is:"+currenturl);
        System.out.println("The current page source is"+driver.getPageSource());
        
       	}
	
	public static void main(String[] args) {
		
		GetCommands getobj=new GetCommands();
		getobj.invokebrowser();
		// TODO Auto-generated method stub

	}

}
