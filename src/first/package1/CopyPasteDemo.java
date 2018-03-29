package first.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteDemo {
	

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/advanced_search");
		try {
			Thread.sleep(1000);
		
			// TODO Auto-generated catch block
			//enter data in the textbox
		driver.findElement(By.id("_dKg")).sendKeys("selenium");
		//select the text in the textbox
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"a");
		//copy the selected data
		driver.findElement(By.id("_dKg")).sendKeys(Keys.CONTROL+"c");
		//paste the data in the next textbox
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("_aKg")).sendKeys(Keys.CONTROL+"v");
		
		//driver.findElement(By.id("_dKg")).sendKeys(Keys.TAB);
		Thread.sleep(1000);
		}catch (InterruptedException e) {
		}
		//driver.findElement(By.id("_aKg")).sendKeys("selenium");
		//driver.findElement(By.id("_aKg")).sendKeys(Keys.TAB);
		driver.close();
		
	}

}
