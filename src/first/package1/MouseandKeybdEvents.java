package first.package1;

//import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeybdEvents {
	WebDriver driver;
	WebElement link_home,td_Home;
	// Action mouseOverHome;
	//Actions builder;
	
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/selenium/newtours/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	try {
		//public void eventhandling() {
			link_home=driver.findElement(By.linkText("Hotels"));
					 td_Home = driver
		            .findElement(By
		            .xpath("//html/body/div"
		            + "/table/tbody/tr/td"
		            + "/table/tbody/tr/td"
		            + "/table/tbody/tr/td"
		            + "/table/tbody/tr"));    
				Actions builder=new Actions(driver);
					 
		org.openqa.selenium.interactions.Action mouseOverHome=builder.moveToElement(link_home).build();
				
					 String bgColor = td_Home.getCssValue("background-color");
					 System.out.println("Before hover: " + bgColor);
					 mouseOverHome.perform();        
		                bgColor = td_Home.getCssValue("background-color");
		                System.out.println("After hover: " + bgColor);
		                 Thread.sleep(20000);
		                driver.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				 
	}	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MouseandKeybdEvents mkobj=new  MouseandKeybdEvents();
		 mkobj.invokebrowser();

	}}
