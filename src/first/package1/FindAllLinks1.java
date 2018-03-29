package first.package1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindAllLinks1 {
 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		//List linklist=(List) driver.findElements(By.tagName("a"));
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		/*Iterator<WebElement>i1=linklist.iterator();
		System.out.println("listitem is"+i1.next());*/
		for(int i=0;i<linklist.size();i++) {
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
		}
		
	}
}

 
