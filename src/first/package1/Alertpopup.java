package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alertpopup {
	WebDriver driver;
	//Alert alert1;
	public void invokebrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/selenium/delete_customer.php");
            alertgenerate();
            Thread.sleep(2000);
                       driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public void alertgenerate() {
		try {
			driver.findElement(By.name("cusid")).sendKeys("1234");
			driver.findElement(By.name("submit")).click();
//creating Alert class object and switching to alert window.
			Alert alert1=driver.switchTo().alert();		
			//storing alert message
			String alertmsg=driver.switchTo().alert().getText();
			System.out.println(alertmsg);
			Thread.sleep(2000);
			alert1.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	
		
		
	}
	

	public static void main(String[] args) {
		Alertpopup objal=new Alertpopup();
		objal.invokebrowser();
		
		// TODO Auto-generated method stub

	}

}
