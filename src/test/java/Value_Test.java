import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Browser_Page.Browser;
import Main_Page.Run_calen;

public class Value_Test {
	WebDriver driver;
	Browser browser;
Run_calen  dropck;
	
	@Test
	public void launch() throws Exception {
		driver=Browser.launch();
		 dropck=PageFactory.initElements(driver,Run_calen.class);
		dropck.CK_cal();
		
	}
	
	}


