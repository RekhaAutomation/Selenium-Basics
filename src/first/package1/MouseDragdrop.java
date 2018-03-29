package first.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragdrop {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//create Action class object
		Actions builder=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement target=driver.findElement(By.id("bank"));
		Thread.sleep(2000);
		//calling dragAnddrop function
		builder.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
