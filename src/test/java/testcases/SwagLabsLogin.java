package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SwagLabsLoginPage;

public class SwagLabsLogin extends BaseClass{
	
	@Test
	public void PositiveLogin() {
		SwagLabsLoginPage lp = new SwagLabsLoginPage(driver);
		lp.Login("standard_user", "secret_sauce");
		
		WebElement actual = driver.findElement(By.className("title"));
		String actualresult = actual.getText();
		String expectedresult = "PRODUCTS";
		
		Assert.assertEquals(actualresult, expectedresult);
	}
	
	@Test
	public void NegativeLogin() {
		SwagLabsLoginPage lp = new SwagLabsLoginPage(driver);
		lp.Login("standard_user", "secret");
		
		WebElement actual = driver.findElement(By.xpath("//h3[@data-test=\"error\"]"));
		String actualresult = actual.getText();
		String expectedresult = "Epic sadface: Username and password do not match any user in this service";
		
		Assert.assertEquals(actualresult, expectedresult);
	}
}
