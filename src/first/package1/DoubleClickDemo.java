package first.package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClickDemo {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//create Actions class object
		Actions builder=new Actions(driver);
	WebElement mousel=driver.findElement(By.className("gsfi"));
	mousel.sendKeys("hello");
	//performing right click operation
	org.openqa.selenium.interactions.Action rightclick=builder.contextClick(mousel).build();
	rightclick.perform();
	Thread.sleep(2000);
	driver.close();
	}

}
