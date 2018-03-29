
package first.package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlselect {
	Select drpselect;
	WebDriver driver;

	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/selenium/newtours/register.php");
			dropdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dropdown() {
		try {
			drpselect = new Select(driver.findElement(By.name("country")));
			drpselect.selectByVisibleText("ANTARCTICA");

			Thread.sleep(2000);

			boolean multi = drpselect.isMultiple();
			System.out.println(multi);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Dropdownlselect dlobj = new Dropdownlselect();
		dlobj.invokebrowser();

	}

}
