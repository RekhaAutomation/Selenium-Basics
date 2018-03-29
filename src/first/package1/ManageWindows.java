package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;		
import java.util.Set;	

//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ManageWindows {
	WebDriver driver;
	Alert alert1;
	public void invokebrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/popup.php");
            Thread.sleep(2000);
            windowmanage();
            
            
            Thread.sleep(2000);
                       driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void windowmanage() {
		driver.findElement(By.linkText("Click Here")).click();
		String mainwin=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()) {
			String ChildWindow=i1.next();
			if(!mainwin.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				driver.close();
				
			}
			
		}
		driver.switchTo().window(mainwin);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ManageWindows objmw=new ManageWindows();
objmw.invokebrowser();
	}

}
