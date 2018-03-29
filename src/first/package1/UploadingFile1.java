package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadingFile1 {
	WebDriver driver;
	public void invokebrowser() {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/upload/");
		uploadfile1();
	
	}
	 public void uploadfile1(){
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ganib\\Documents\\20140924-IDM ONLINE TRAINING SESSION TOMORROW@7AM IST BY SRIKANTH.186(1863565071)");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		driver.close();
	}
	public static void main(String[] args) {
		
		UploadingFile1  ufobj =new UploadingFile1();
		ufobj.invokebrowser();
		
		// TODO Auto-generated method stub

	}

}
