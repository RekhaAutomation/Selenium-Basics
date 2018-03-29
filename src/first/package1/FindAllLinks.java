package first.package1;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {
	WebDriver driver;
	WebElement  List,e;
	String underconstitle= "Under Construction: Mercury Tours";
	 
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/selenium/newtours/");
			findlinks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	 
	public void findlinks() {
		
	try {
		java.util.List<WebElement> linkelements=driver.findElements(By.tagName("a"));
			String[] linkTexts = new String[linkelements.size()];
			int i=0;
			for (WebElement e : linkelements) {							
				linkTexts[i] = e.getText();							
				i++;			
		    }		
			for (String t : linkTexts) {	
				//Thread.sleep(1000);
				driver.findElement(By.linkText(t)).click();	
				//Thread.sleep(1000);
				if(driver.getTitle().equals(underconstitle)) {
					System.out.println("\"" + t + "\""+"this link is under construction");
					driver.navigate().back();
				}
					else
					{   Thread.sleep(2000);	
						System.out.println("\"" + t + "\""+"this link is working successfully");
						driver.navigate().back();
	
					}
					
			
			}			
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	}
	
	
	

	public static void main(String[] args) {
		FindAllLinks fal=new FindAllLinks();
		fal.invokebrowser();
		
	}

}
 