package first.package1;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Keyboardhandler {
	
	WebDriver driver;
	WebElement txtuser;
	Actions builder;
	Action seriesofatn;
			           
			           
	
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			Thread.sleep(2000);
			keybrd();
			Thread.sleep(2000);
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	public void keybrd() {
		txtuser=driver.findElement(By.id("email"));
		builder=new Actions(driver);
		
seriesofatn=builder.moveToElement(txtuser).click().keyDown(txtuser,Keys.SHIFT).sendKeys(txtuser,"hello").
keyUp(txtuser,Keys.SHIFT).doubleClick(txtuser).contextClick().build();
seriesofatn.perform();
		
	}

	public static void main(String[] args) {
		Keyboardhandler obj=new Keyboardhandler();
		obj.invokebrowser();
		// TODO Auto-generated method stub

	}

}
