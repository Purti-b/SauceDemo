package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {

//***************************************Object****************************************
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(id = "login-button")
	WebElement Login;
	
	public SwagLabsLoginPage(WebDriver basedriver) {
		this.driver = basedriver;
		//it will initialize all the FindBy elements on basedriver (the way we use driver.findElement) whenever this element will be needed (all elements present on this page)
		PageFactory.initElements(basedriver, this);  
	}
	
//**************************************Method****************************************
	
	public void Login(String UsernameVal, String PassVal) {
		
		username.click();
		username.sendKeys(UsernameVal);
		
		password.click();
		password.sendKeys(PassVal);
		
		Login.click();
		
	}
	
}
