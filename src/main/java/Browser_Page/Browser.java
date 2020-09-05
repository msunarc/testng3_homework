package Browser_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
static WebDriver driver;
	

	public static  WebDriver launch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101");
		driver.manage().deleteAllCookies();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
		
	}
			
			
		}


