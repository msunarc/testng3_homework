package Main_Page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
//Validate the month drop down has all the months (jan, feb, mar ...) in the Due Date dropdown section.
public class Run_calen {
WebDriver driver;
	
	public Run_calen(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.NAME,using="due_month")		
	WebElement DropDown;
	
	public void CK_cal() {
		
		String[] month = {"None","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	// WebElement DropDown =driver.findElement(By.cssSelector("//select[name=\"due_month\"]"));
	 Select select=new Select(DropDown);
	 DropDown.click();
	 
	 List<WebElement> month_list=select.getOptions();// is used to get all options from the dropdown list//
	 for (WebElement we : month_list)
	 {
		 for(int i=0;i<month.length;i++) {
			 if(we.getText().equalsIgnoreCase(month[i])) {
				 System.out.println("All months are matched");
			 }

		 }}}}
	
	



