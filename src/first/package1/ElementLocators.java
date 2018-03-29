package first.package1;

//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
public class ElementLocators {
	WebDriver driver;
	WebElement List;
	Iterator<WebElement> i;
	public void invokebrowser(String url) {
		try {
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
					driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					driver.get(url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public void elementlocatortechniquesAmz() {		
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo laptops");
			driver.findElement(By.className("nav-input")).click();
			driver.findElement(By.linkText("Your Amazon.in")).click();
			driver.navigate().back();	
			driver.findElement(By.partialLinkText("Customer")).click();
			
		}
		public void elementlocatortechniquesFB() {
			driver.findElement(By.name("firstname")).sendKeys("Rekha");
			driver.findElement(By.cssSelector("input#email")).sendKeys("abcd@gmail.com");
			//driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-yourAccount']/span[1]")).click();
			//linklist=(List) driver.findElements(By.tagName("a"));
			List<WebElement> linkelements= driver.findElements(By.tagName("a"));
			i=linkelements.iterator();
			System.out.println(i.next());
			//Iterator<WebElement>i1=linklist.iterator()
		}
		
	public void driverclose() {
		driver.quit();
	
	}
	

	public static void main(String[] args) {
		ElementLocators objel=new ElementLocators();
		objel.invokebrowser("http://www.amazon.in");
		objel.elementlocatortechniquesAmz();
	objel.invokebrowser("http://www.facebook.com");
				objel.elementlocatortechniquesFB();
		objel.driverclose();
		// TODO Auto-generated method stub

	}

}
