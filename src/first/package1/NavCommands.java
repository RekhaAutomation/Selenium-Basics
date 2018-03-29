package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavCommands {
	WebDriver driver;

	public void invokebrowser() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		navigatecommands();
		driver.close();

	}
	
public void navigatecommands() {
	
	try {
		driver.navigate().to("http://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		//driver.findElement(By.className("dialog-confirm")).click();
		//driver.findElement(By.cssSelector("button.dialog-confirm")).click();
		//driver.findElement(By.cssSelector(".btn.dialog-confirm.btn-primary")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("//span[starts-with(text(),'Appliances')]")).click();
		driver.findElement(By.linkText("Advertise")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Microwave Ovens')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {		// TODO Auto-generated method stub

		NavCommands ncobj=new NavCommands();
		ncobj.invokebrowser();
	}

}
