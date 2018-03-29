package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIframes {
	WebDriver driver;
	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home");
		driver.switchTo().frame("a077aa5e");
		System.out.println("switched to different frame");
		driver.findElement(By.xpath("html/body/a/img")).click();
        System.out.println("clicked on image");	
        int  framecount=driver.findElements(By.tagName("iframe")).size();
        System.out.println("No.of frames in this page:" +framecount);
driver.switchTo().parentFrame();
		driver.quit();
				
	}

	public static void main(String[] args) {
		
			UsingIframes ui=new UsingIframes();
			ui.invokebrowser();
			
		}
		

	}


