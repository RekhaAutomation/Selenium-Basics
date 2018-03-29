package first.package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.walmart.com");
		driver.manage().window().maximize();
		//create Actions class object
		Actions builder=new Actions(driver);
		//identifying element and storing in WebElement
		WebElement mouseelement=driver.findElement(By.xpath("//*[@id=\'header-GlobalLefthandNav-toggle-1\']/span[2]"));
		//move the cusor focus to  element and performing action
         builder.moveToElement(mouseelement).build().perform();
         mouseelement=driver.findElement(By.id("superDeptId-6"));
         builder.moveToElement(mouseelement).build().perform();
         mouseelement=driver.findElement(By.linkText("LEGO & Building Sets"));
         builder.moveToElement(mouseelement).click().build().perform();
         String actualttl=driver.getTitle();
         String exttl="Building Sets & Blocks - Walmart.com";
         
         System.out.println("current page title is"+actualttl);
                 if(exttl.equalsIgnoreCase(actualttl)) {
                	 System.out.println("testcase passed");}
                	 else {
                		 System.out.println("testcase failed");
                	 }
         driver.close();
          
	}
	
}
