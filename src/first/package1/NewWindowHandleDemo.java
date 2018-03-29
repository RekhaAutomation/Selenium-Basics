package first.package1;

//import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class NewWindowHandleDemo {
	static Select sitem, sitemy;

	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.get("http://www.hdfcbank.com");
			Thread.sleep(8000);

			/*
			 * //driver.findElement(By.xpath(
			 * "[@id='element4']/div/div/div[1]/div/div[1]/a/img")).click();
			 * driver.findElement(By.xpath("//a/img[@alt='close']")).click();
			 * //JavascriptExecutor jse= (JavascriptExecutor) driver;
			 * //jse.executeScript("window.scroll((0,2000))"); Robot robot = new Robot();
			 * robot.keyPress(KeyEvent.VK_PAGE_DOWN); Thread.sleep(4000);
			 * driver.findElement(By.linkText("Credit Card")).click();
			 */

			driver.findElement(By.xpath("//img[@alt='Credit Cards' and @class='front icon']")).click();

			Thread.sleep(3000);
			// driver.findElement(By.xpath("//*[@id=\"element2\"]/div[1]/div/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/a[1]")).click();
			driver.findElement(By.xpath("//div[@class='buttons']/a[@title='Click to apply for Credit Cards']")).click();
			Thread.sleep(1000);
			String parentwindow = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();//i1.next() represents the first value in the Set of String array.So it represents
			//the first window i.e parent window.
			

			while (i1.hasNext()) {
				String childwindow = i1.next();
				if (!parentwindow.equalsIgnoreCase(childwindow)) {
					driver.switchTo().window(childwindow);
					driver.findElement(By.id("txtFName")).clear();
					driver.findElement(By.id("txtFName")).sendKeys("Akshara");
					driver.findElement(By.id("txtLName")).clear();
					driver.findElement(By.id("txtLName")).sendKeys("Ganib");
					driver.findElement(By.id("txtDateOfBirth")).click();
					sitem = new Select(driver.findElement(By.xpath("//div/select[@class='ui-datepicker-month']")));
					sitem.selectByVisibleText("Jan");
					sitemy = new Select(driver.findElement(By.xpath("//div/select[@class='ui-datepicker-year']")));
					sitemy.selectByVisibleText("1999");
					driver.findElement(By.xpath(
							"//div[@id='ui-datepicker-div']//table/tbody/tr/td[@data-handler='selectDay']/a[contains(text(),14)]"))
							.click();
					Thread.sleep(2000);
					//// div/select[@class='ui-datepicker-month']
					driver.close();

				}
			}
			driver.switchTo().window(parentwindow);
 			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("saving account");
			driver.findElement(By.xpath("//div[@class='sf-searchicon']")).click();
			driver.quit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//// *[@id="element4"]/div/div/div[1]/div/div[1]/a/img

	//// *[@id="element4"]/div/div/div[1]/div/div[1]/a/img
	//// img[@alt='Credit Cards' and @class='front icon']
}

// img[contains(text,'Credit Cards')]
// #element4 > div > div > div.opendiv > div > div.cloase2 > a > img

// *[@id="element4"]/div/div/div[1]/div/div[1]/a/img

// *[@id="element2"]/div[1]/div/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/a[1]