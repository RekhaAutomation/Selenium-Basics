package first.package1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Firefoxtest{

	

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.driver", "\"C:\\FirefoxPortable.exe\"");
			//WebDriver driver=new FirefoxDriver();
			//driver.get("https://www.facebook.com");
			//driver.close();
			
		
			System.setProperty("webdriver.firefox.driver","\"C:\\Program Files (x86)\\geckodriver-v0.17.0-win64\\geckodriver.exe\"");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://www.amazon.in");
			
			
			}
	

}
