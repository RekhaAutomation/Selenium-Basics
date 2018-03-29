package first.package1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
	WebDriver driver;
	//WebElement col;
	
public void invokebrowser() {
	System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
	finddelement();
	driver.close();
	
	}

public void finddelement() {
	java.util.List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("No.of columns are "+col.size());
	
		java.util.List<WebElement> row=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
	System.out.println("No. of rows are " +row.size());
	WebElement mytable=driver.findElement(By.tagName("table"));
	WebElement myrow=mytable.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]"));
	String text=myrow.getText();
	System.out.println("third row of table is" +text);
			
}
	public static void main(String[] args) {
		 DynamicTables dtobj=new  DynamicTables();
		 dtobj.invokebrowser();
		 //*[@id="leftcontainer"]/table/thead/tr/th[1]
		//*[@id="leftcontainer"]/table/tbody/tr[3]/td[1]
		

	}

}
