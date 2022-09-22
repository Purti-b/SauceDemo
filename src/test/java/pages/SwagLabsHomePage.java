package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage {

	WebDriver driver;



	public SwagLabsHomePage(WebDriver basedriver) {
		this.driver = basedriver;
		//it will initialize all the FindBy elements on basedriver (the way we use driver.findElement) whenever this element will be needed (all elements present on this page)
		PageFactory.initElements(basedriver, this);
	}
	
	public void getProduct(String product) {
		
	}
}
