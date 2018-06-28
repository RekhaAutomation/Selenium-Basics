package first.package1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondproject {

	WebDriver driver;
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://mail.google.com");
			sendanemail();
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void sendanemail(){

		try {
			driver.findElement(By.id("identifierId")).sendKeys("");
			driver.findElement(By.className("CwaK9")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("pass");
			Thread.sleep(2000);
			driver.findElement(By.className("CwaK9")).click();

			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.id(":nm")).sendKeys("");
			driver.findElement(By.name("subjectbox")).sendKeys("mail from selenium");
			Thread.sleep(4000);
			Thread.sleep(4000);

			driver.findElement(By.xpath("(.//*[@aria-label='Message Body'])[2]")).sendKeys("Hope it is success:");
			Thread.sleep(4000);	
			driver.findElement(By.xpath("//div[contains(text(),'Send')]")).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Secondproject spobj=new Secondproject();
		spobj.invokebrowser();
		// TODO Auto-generated method stub

	}

}
