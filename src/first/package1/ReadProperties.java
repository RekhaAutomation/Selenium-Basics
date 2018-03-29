package first.package1;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	static WebDriver driver;

	public static void main(String[] args) {
		
		try {
			Properties prop=new Properties();
			//reading config.properties file
			FileInputStream fis=new FileInputStream("C:\\Users\\ganib\\eclipse-workspace\\newproject\\src\\first\\package1\\config.properties");
			//loading the file
			prop.load(fis);
			//reading and printing the properties using getPropety() method
			System.out.println(prop.getProperty("username"));
			System.out.println(prop.getProperty("emailid"));
			System.out.println(prop.getProperty("password"));
			System.out.println(prop.getProperty("filename"));
			String vurl=prop.getProperty("url");
			System.out.println(vurl);
			String browsername=prop.getProperty("browser");
			
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			 driver=new ChromeDriver();
			}
			else {
				System.out.println("Firefox driver not installed");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
			
	}

}
