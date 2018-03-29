package first.package1;
		 
		import java.io.IOException;
		 
		import java.util.concurrent.TimeUnit;
		 
		import org.openqa.selenium.By;
		 
		import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        

		 
		public class FileuploadAutoit {
			
		public static WebDriver driver;
		 
			public static void main(String[] args) throws IOException, InterruptedException {
				try {
					System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
					
					driver = new ChromeDriver();
					
					
 				
							 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
					driver.get("http://toolsqa.wpengine.com/automation-practice-form");
 
					driver.findElement(By.id("photo")).click();
 
					Runtime.getRuntime().exec("C:\\Users\\ganib\\Documents\\TestUpload");
 
					Thread.sleep(5000);
					System.out.println("file uploaded");
 
					driver.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
			}
		 
		
		// TODO Auto-generated method stub

	}


