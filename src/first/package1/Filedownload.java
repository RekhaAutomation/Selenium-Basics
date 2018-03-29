package first.package1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filedownload {
	WebDriver driver;
	WebElement dwnloadbtn;
	
	
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://messenger.yahoo.com");
			filedwnload(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void filedwnload() {
	
		try {
			dwnloadbtn=	driver.findElement(By.linkText("Download for Windows"));
			String sourceLocation = dwnloadbtn.getAttribute("href");
	System.out.println(sourceLocation);
			String wget_command = "cmd /c C:\\Users\\ganib\\wget\\wget64.exe -P D: --no-check-certificate " + sourceLocation;
			Process exec;

				exec = Runtime.getRuntime().exec(wget_command);
			
			int exitVal = exec.waitFor();
			System.out.println("Exit value: " + exitVal);
			System.out.println(exec.toString());
				//Thread.sleep(10000);
			driver.quit();
			} catch (IOException e) {
		        e.printStackTrace();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		Filedownload dnobj=new Filedownload();
		dnobj.invokebrowser();
		
		
		
		// TODO Auto-generated method stub

	}

}
