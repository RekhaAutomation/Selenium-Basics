package first.package1;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
 

public class FullpageScreenshot {
		public static void main(String[] args)throws Exception {
  
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com");
		Thread.sleep(2000);
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	    ImageIO.write(fpScreenshot.getImage(),"PNG",new File("D:///FullPageScreenshot.png"));
	    driver.close();
        }



	}


